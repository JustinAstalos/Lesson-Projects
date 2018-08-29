import java.awt.geom.Line2D.Double;
import java.util.Scanner;

public class OhmsLaw
{  
  public static void main ( String[] args )  
  {
    int voltage;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the voltage:");
    voltage = scan.nextInt();

    Double resistance;
    System.out.println("Enter the resistance:");
    resistance = scan.nextDouble();

    double current = (voltage +0.0)/resistance;
    System.out.println("The current is "+current+" watts");
  }
}