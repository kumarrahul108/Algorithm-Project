
// Insertation Sort Algo

public class Insertation_Sort 
{

    // display the array
    public static void display(int a[])
    {
        int n = a.length;
        for(int i = 0;i<n;i++)
        {
            System.out.print(a[i] + "  ");
        }
    }


    // insertation sorting
    public static void insertaion_Sort(int a[])
    {
        int n = a.length;

        // for traversal in array after keeping 1st element separtly
        for(int i = 1;i<n;i++)
        {
            int curr = a[i];  // store current element
            int j = i-1;   

            while(j>=0 && curr < a[j])
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = curr;

        }
    }


    public static void main(String[] args) 
    {
        int arr[] = {7,8,3,1,2};

        System.out.print("\nArray Elements :   \n");
        display(arr);
        insertaion_Sort(arr);
        System.out.print("\nArray Sorted Using Insertation Technique :   \n");
        display(arr);
    }    
}
