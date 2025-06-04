import java.util.Scanner;

class CountDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");

        int n = sc.nextInt();

        System.out.println("Total no.of digits in " + n + " are " + DigitsCount(n));
    }

    public static int DigitsCount(int n)
    {
        int count = 0;
        while(n!=0)
        {
            n = n/10;
            count++;
        }
        return count;
    }
}