import java.util.Scanner;

class Array_Insertion
{
    public static int maxSize = 100;
    public static int arr[] = new int[maxSize];
    public static int size = 0;

    public static void insetAtLast(int value)
    {
        if(size<maxSize)
        {
            arr[size++] = value;
        }
        else
        {
            System.out.println("Array is full");
        }
    }

    public static void insertAtFirst(int value)
    {
        if(size<maxSize)
        {
            for(int i=size;i>0;i--)
            {
                arr[i] = arr[i-1];
            }
            arr[0] = value;
            size++;
        }
        else
        {
            System.out.println("Array is Full");
        }
    }

    public static void insertAtAnyPosition(int pos,int value)
    {
        if(size<maxSize)
        {
            for(int i=size;i>pos;i--)
            {
                arr[i] = arr[i-1];
            }
            arr[pos-1] = value;
            size++;
        }
        else
        {
            System.out.println("Array is Full");
        }

    }

    public static void main(String[] args)
    {
        insetAtLast(10);
        insetAtLast(20);
        insetAtLast(30);

        insertAtFirst(5);
        insertAtFirst(50);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the postion: ");
        int pos = sc.nextInt();
        insertAtAnyPosition(pos,125);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}