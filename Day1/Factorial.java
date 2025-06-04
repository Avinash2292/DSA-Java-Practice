import java.util.Scanner;

class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of the number " + n + " is " + fact(n));

    }

    public static int fact(int n)
    {
        int res = 1;
        for(int i=1;i<=n;i++)
        {
            res = res*i;
        }
        return res;
    }
}