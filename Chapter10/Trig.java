public class Trig
{  
  public static void main ( String[] args )  
  {
    double degrees=30;
    double rad = degrees * Math.PI/180;
    double sin=Math.sin(rad);
    double cos=Math.cos(rad);
    double sinx=sin*sin;
    double cosx=cos*cos;
    double sum=sinx+cosx;
    System.out.println("sine: "+sin+" cosine: "+cos+" sum of squares: "+ sum);
  }
}