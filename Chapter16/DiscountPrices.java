import java.util.Scanner;

public class DiscountPrices
{  
  public static void main ( String[] args )  
  {
    int total;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the total price of your purchase:");
    total = scan.nextInt();

    int total2 = total*0.90;
    System.out.println("The discounted price of your purchase is $"+total2);
  }
}