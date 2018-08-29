public class ReassigningValues
{  
  public static void main ( String[] args )  
  {
      double X = 4.0;
      double result = (3*((X)*(X))-8*(X)+4);
      System.out.println("(4.0, "+result+")");
      X = 2.0;
      result = (3*((X)*(X))-8*(X)+4);
      System.out.println("(2.0, "+result+")");
      X = 0.0;
     result = (3*((X)*(X))-8*(X)+4);
      System.out.println("(0.0, "+result+")");
  }
}  