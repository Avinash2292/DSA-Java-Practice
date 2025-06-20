import java.util.Scanner;

class MergeSort
{

    public static void mergeSort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int arr[],int low,int mid,int high)
    {
        int n1 = mid-low+1;
        int n2 = high - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int x=0;x<n1;x++)
        {
            lArr[x] = arr[low+x];
        }

        for(int x=0;x<n2;x++)
        {
            rArr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while(i<n1 && j<n2)
        {
            if(lArr[i] < rArr[j])
            {
                arr[k] = lArr[i];
                i++;
            }
            else
            {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the Elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,arr.length-1);

        for(int n : arr)
        {
            System.out.print(n + " ");
        }
    }
}