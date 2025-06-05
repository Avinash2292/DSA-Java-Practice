import java.util.Scanner;

class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size :");

        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        for(int n : arr)
        {
            System.out.print(n + " ");
        }
    }

    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}