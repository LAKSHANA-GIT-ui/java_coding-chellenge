import java.util.Scanner;

public class coding7 {
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int a = sc.nextInt();
        System.out.println("Enter second num:");
        int b = sc.nextInt();

        int greater = (a > b)? a : b;

        System.out.println("The greater num is :" +greater);

    }
    
}
