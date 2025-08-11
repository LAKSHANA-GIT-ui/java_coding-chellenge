import java.util.Scanner;

public class arcod4
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        

        int size = sc.nextInt();

        int[] arr = new int[size];
        
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        int middleIndex = size / 2;
         
        System.out.println("Middle element: " +arr[middleIndex]);
    }

    }

}


















