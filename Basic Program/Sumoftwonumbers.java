import java.util.Scanner;
public class Sumoftwonumbers
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();

        int sum = a + b;
        System.out.println("SUM = "+sum);
    }
}