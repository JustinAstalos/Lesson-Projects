import java.util.Scanner;

public class OrderChecker
{  
  public static void main ( String[] args )  
  {
    int bolts;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the number of bolts:");
    bolts = scan.nextInt();

    int nuts;
    System.out.println("Enter the number of nuts:");
    nuts = scan.nextInt();

    int washers;
    System.out.println("Enter the number of washers:");
    washers = scan.nextInt();

    if (bolts>nuts)
    {
        System.out.println("Check the Order: Too few nuts");
    }

    if (bolts>(washers/2))
    {
        System.out.println("Check the Order: Too few washers");
    }
    
    double totalCost = ((bolts*5)+(nuts*3)+(washers))/100.0;
    System.out.println("Total cost: $"+totalCost);
  }
}