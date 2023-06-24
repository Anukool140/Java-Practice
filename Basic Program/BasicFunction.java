import java.util.Scanner;
public class BasicFunction 
{
    public static void printUserName (String name)
    {
        System.out.print("User Name is => ");
        System.out.print(name);
        return;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a user name. ");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        printUserName(username);
    }
    
}
