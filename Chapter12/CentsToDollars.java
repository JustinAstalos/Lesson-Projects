import java.util.Scanner;

public class CentsToDollars
{  
  public static void main ( String[] args )  
  {
    int cents;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the number of cents:");
    cents = scan.nextInt();
    int dollars = cents/100;
    cents = (cents-(dollars*100));
    int quarters = cents /25;
    int dimes = (cents - (quarters*25))/10;
    int nickles = (cents - ((dimes*10)+(quarters*25)))/5;
    int pennies = (cents - ((dimes*10)+(quarters*25)+(nickles*5)));
    System.out.println("The total is " + dollars + " dollars and " + cents+ " cents, which is comprised of "+quarters+" quarters, "+dimes+" dimes, "+nickles+" nickles, and "+pennies+" pennies.");
  }
}