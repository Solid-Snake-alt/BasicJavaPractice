import java.util.*;
public class BubbleSort
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [10];
        //accepting an array
        for (int i = 0; i<10; i++)
        {
            System.out.println("Enter the characters");
            arr[i] = (int) sc.next().charAt(0);
        }
        //printing the original array
        for (int i = 0; i<10; i++)
        {
            System.out.print((char)arr[i]+" ");
        }
        //sorting the array
        for (int i = 0; i<10; i++)
        {
            for (int j = 0; j<10-i; j++)
            {
                if (arr[j]>arr[j+1])
                {
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
            }
            }
        }
        //printing the swapped array
        System.out.println();
        for (int i = 0; i<10; i++)
        {
            System.out.print((char) arr[i]+" ");
        }
    }
}
