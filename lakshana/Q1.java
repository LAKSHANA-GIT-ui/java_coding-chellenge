import java.util.Scanner;

class Q1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double score = sc.nextDouble();
        sc.nextLine();
        String department = sc.nextLine();

        System.out.println("My name is "+name);
        System.out.println("My score is "+score/10 + "/10");
        System.out.print("My department is "+department);
    }
}