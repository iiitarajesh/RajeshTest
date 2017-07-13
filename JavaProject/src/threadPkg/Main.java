package threadPkg;

import java.util.Random;

class RestaurantCustomer extends Thread {
  private Restaurant r;
  private int customerID;
  private static final Random random = new Random();

  public RestaurantCustomer(Restaurant r, int customerID) {
    this.r = r;
    this.customerID = customerID;
  }
  public void run() {
    r.getTables(this.customerID); // Get a table
    try {
      int eatingTime = random.nextInt(30) + 1;
      System.out.println("Customer #" + this.customerID
          + "  will eat for " + eatingTime + "  seconds.");
      Thread.sleep(eatingTime * 1000);
      System.out.println("Customer #" + this.customerID
          + "  is done  eating.");
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      r.returnTable(this.customerID);
    }
  }
}
public class Main{
  public static void main(String[] args) {
    Restaurant restaurant = new Restaurant(2);
    for (int i = 1; i <= 5; i++) {
      RestaurantCustomer c = new RestaurantCustomer(restaurant, i);
      c.start();
    }
  }
}