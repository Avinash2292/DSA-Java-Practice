import java.util.Scanner;

class FactorialRecursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is " + fact(n));
    }

    public static int fact(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}