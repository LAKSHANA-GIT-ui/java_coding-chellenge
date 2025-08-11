  import java.util.Scanner;
class coding6{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
         int salary = sc.nextInt();
        System.out.println("Enter your age");
         int age = sc.nextInt();

         if(salary>=2000 || age<=25)
        {
            System.out.println("You are eligible for loan");
            System.out.println("Enter requide loan");
            int loan =sc.nextInt();
        
        if(loan<50000)
        {
            System.out.println("AVAILABLE");
        }
        else{
            System.out.println("NOT AVAILABLE");
        }
    }
}
}