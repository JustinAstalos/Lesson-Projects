public class StringLength
{
  public static void main ( String[] args )
  {
    String str;
    String str2;
    int    len;

    str = "  Elementary,  my     dear Watson!  ";
    str2 = str.trim();
    len = str.length();

    System.out.println("The length is: " + len );
    System.out.println(str);
    System.out.println(str2);
  }
}