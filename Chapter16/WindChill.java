import java.util.Scanner;
import java.lang.Math;

public class WindChill
{  
  public static void main ( String[] args )  
  {
    int temp;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the temperature");
    temp = scan.nextInt();

    int wind;
    System.out.println("Enter the wind speed:");
    temp = scan.nextInt();

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