import java.util.Scanner;
 class Sumoftwonumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter two numbers.");
        int sum = a + b;
        System.out.println("SUM = "+sum);
    }
}