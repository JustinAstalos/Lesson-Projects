import java.util.Scanner;

public class CircleArea
{  
  public static void main ( String[] args )  
  {
    double radius;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the radius:");
    radius = scan.nextDouble();
    double area = (radius*radius*Math.PI);
    System.out.println("The area is " + area);
  }
}