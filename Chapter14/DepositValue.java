import java.util.Scanner;

public class DepositValue
{  
  public static void main ( String[] args )  
  {
    int deposit;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the initial deposit:");
    deposit = scan.nextInt();

    double interestRate;
    System.out.println("Enter the interest rate in a percent:");
    interestRate = scan.nextDouble()/100.0;

    int compoundRate;
    System.out.println("Enter the number of times per year interest is compounded");
    compoundRate = scan.nextInt();

    int years;
    System.out.println("Enter the number of years:");
    years = scan.nextInt();

    double returnValue = deposit*Math.pow((1+(interestRate/compoundRate)), (compoundRate*years));
    System.out.println("The return on this investment is $"+returnValue);
  }
}