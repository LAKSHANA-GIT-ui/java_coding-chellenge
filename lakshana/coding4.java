import java.util.Scanner;
class codig4{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
     
    int S1 = sc.nextInt();
    int S2 = sc.nextInt();
    int S3 = sc.nextInt();
    int S4 = sc.nextInt();
    int S5 = sc.nextInt();

    int totalmark = S1+S2+S3+S4+S5;

    int avg = totalmark/5;

    if(avg<35)
    {
        System.out.print("ADDITIONAL CLASS REQUIRED");
    }

    else
    {
        System.out.print("STAY FREE");
    }



    }
}
