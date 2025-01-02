package ua.edu.ucu.apps.task1;

public class ATM {
  private Banknote firstTray;

  public ATM() {
    firstTray = new Banknote100();
    Banknote secondTray = new Banknote50();
    Banknote thirdTray = new Banknote20();
    Banknote fourthTray = new Banknote5();
    firstTray.setCount(5);
    secondTray.setCount(5);
    thirdTray.setCount(5);
    fourthTray.setCount(5);
    firstTray.setNextItem(secondTray);
    secondTray.setNextItem(thirdTray);
    thirdTray.setNextItem(fourthTray);
  }

  public void process(int amount) {
    firstTray.process(amount);
  }
}
