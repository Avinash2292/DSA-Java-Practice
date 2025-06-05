import java.util.Scanner;

class SelectionSort
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

        selectionSort(arr);
        System.out.println("SelctionSort");
        for(int n : arr)
        {
            System.out.print(n + " ");
        }
    }

    public static void selectionSort(int arr[])
    {
         int n = arr.length;
         for(int i=0;i<n-1;i++)
         {
             int min = i;
             for(int j = i+1;j<n;j++)
             {
                 if(arr[j]<arr[min])
                 {
                     min = j;
                 }
             }
             if(i!=min)
             {
                 arr[i] = arr[i] + arr[min];
                 arr[min] = arr[i] - arr[min];
                 arr[i] = arr[i] - arr[min];
             }
         }
    }
}