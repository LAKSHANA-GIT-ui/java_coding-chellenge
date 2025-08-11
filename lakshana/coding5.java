import java.util.Scanner;
class coding5{
    public static void main(String[]agrs)
    {
     Scanner sc = new Scanner(System.in);
      String color = sc.nextLine();

      if(color.equals("red"))
      System.out.print("stop");

      else if(color.equals("Yellow"))
      {
        System.out.print("Get ready");
      }
      else if(color.equals("Green"))
      {
        System.out.print("Go");
      }
    }
}