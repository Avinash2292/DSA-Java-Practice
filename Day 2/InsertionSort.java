import java.util.Scanner;

class InsertionSort
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

        insertionSort(arr);

        for(int n : arr)
        {
            System.out.print(n + " ");
        }
    }

    public static void insertionSort(int arr[])
    {
         int n = arr.length;
         for(int i=1;i<n;i++)
         {
             int temp = arr[i];
             int j = i-1;
             while(j>=0 && arr[j]>temp)
             {
                 arr[j+1] = arr[j];
                 j--;
             }
             arr[j+1] = temp;
         }
    }
}