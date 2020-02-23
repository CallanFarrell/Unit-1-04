import java.util.Scanner;
 
class Microwave {
  public static void main(String[] args) {
    int foodType;
    int quantity;
    double time = 0;
    double cookTimer;
    Scanner wordScanner = new Scanner(System.in);
       
    try {
      System.out.println("Enter (1) for Sub,(2) for Pizza, or (3) for soup");
      foodType = wordScanner.nextInt();
      System.out.println("Please enter quanity. (1-3)"); 
      quantity = wordScanner.nextInt();
      
      if (quantity > 3 | quantity < 1) {
        System.err.println("Invalid Quanitiy!");
      }
      if (foodType == 1) {
        time = 60;
      } else if (foodType == 2) {
        time = 45;
      } else if (foodType == 3) {
        time = 105; 
      } else { 
        System.err.println("Invalid Food!");
      }
  
      cookTimer = time + time * (0.5 * (quantity - 1));
      System.out.println("The timer has been set for " + cookTimer + "s");

    } catch (NumberFormatException nfe) {
      System.err.println("Invalid input!");
    }

  }
}