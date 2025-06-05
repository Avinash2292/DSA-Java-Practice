import java.util.Scanner;

class QuickSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        quickSort(arr,0,arr.length-1);
        System.out.println("---Quick Sort Technique---");
        for(int n : arr)
        {
            System.out.print(n + " ");
        }
    }

    public static void quickSort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }

    }

    public static int partition(int arr[],int low,int high)
    {
        int pivot = arr[low];
        int start = low;
        int end = high;

        while(start<end)
        {
            while(arr[start]<=pivot && start<=end)
            {
                start++;
            }
            while(arr[end]>pivot && start<=end)
            {
                end--;
            }
            if(start<end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[end];
        arr[end] = temp;

        return end;
    }
}