import java.util.Scanner;

public class Sales {
   // calculate sales for individual products
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      double gross = 0.0; // total gross sales
      int product = 0; // the product number
      
      while (product < 4) {
         ++product;
         
         // prompt and read the number of the product sold from user
         System.out.printf("Enter number sold of product #%d: ", product);
         int numberSold = input.nextInt();
         
         // determine gross of each individual product and add to total
         if (product ==1) {
            gross += numberSold * 239.99;
         }
         else if (product == 2) {
            gross += numberSold * 129.75;
         }
         else if (product == 3) {
            gross += numberSold * 99.95;
         }
         else if (product == 4) {
            gross += numberSold * 350.89;
         }
      }
      
      double earnings = 0.09 * gross + 200; // calculate earnings
      System.out.printf("Earnings this week: $%.2f%n", earnings);
   }
}
