import java.util.Scanner;

public class WeightChecker
{  
  public static void main ( String[] args )  
  {
    int weight;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter your weight:");
    weight = scan.nextInt();

    if (weight>=220&&weight<=280)
    {
        System.out.println("Congrats! You qualify!");
    }
    else
    {
        System.out.println("You do not qualify. You just aren't cool enough to eat pie for a crowd like a pig.");
    }
  }
}