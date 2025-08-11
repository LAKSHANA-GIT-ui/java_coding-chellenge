import java.util.Scanner;
class coding8{
    public static void main(String[]args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("num 1 :");
        int a = num.nextInt();
        System.out.println("num 2 :");
        int b = num.nextInt();

        for(int i=a;i<=b;i=i+1)
        {
            System.out.println(i);
        }
    }
}