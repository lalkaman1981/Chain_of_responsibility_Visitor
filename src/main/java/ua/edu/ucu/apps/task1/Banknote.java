package ua.edu.ucu.apps.task1;


import lombok.Setter;

//@AllArgsConstructor
public abstract class Banknote {
  public Banknote nextItem;
  public int banknoteNominale;
  @Setter
  public int count;

  public Banknote(int nominale) {
    this.banknoteNominale = nominale;
  }

  public Banknote setNextItem(Banknote nextItem) {
    this.nextItem = nextItem;
    return nextItem;
  }

  public void process(int amount) {
    int quantity = Math.min(count, amount / banknoteNominale);
    count -= quantity;
    int rest = amount % banknoteNominale;
    if (nextItem != null) {
      nextItem.process(rest);
    } else if (rest > 0) {
      throw new IllegalArgumentException();
    }
    System.out.format("%d x %d\n", banknoteNominale, quantity);
  }


}
