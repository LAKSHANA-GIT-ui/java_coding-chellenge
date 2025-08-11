import java.util.Scanner;
class arcod2{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for(int i=0;i<=4;i=i+1)
        {
            marks[i] = sc.nextInt();
        }
        
        System.out.println(marks[1]);  
    }
}
