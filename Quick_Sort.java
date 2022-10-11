
// Quick Sort Algo

public class Quick_Sort 
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


    // partition algo
    public static int partition(int a[],int low,int high)
    {
        int pivot = a[low]; // choose first element a your pivot

        int i = low +1;
        int j = high;
        int temp;

        do
        {
            // increse index of i to get element greater than pivot 
            if(a[i] <= pivot)
            {
                i++;
            }

            // decrese index of j to get element smaller than pivot 
            if(a[j] > pivot)
            {
                j--;
            }

            // check whether index of i is less or j has not reached i
            if(i < j)
            {
                // swap elements present at index i & j
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }while(i < j);

        // swap with pivot element with final positio of jth element
        temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        
        return j;  // partition index
    }

    // quick sorting
    public static void quickSort(int a[],int low,int high)
    {
        // check whether low index < high index
        if(low < high)
        {
            int pidx = partition(a, low, high);  // partition index

            // for element less than pivot value
            quickSort(a, low, pidx-1);

            // for element graeter than pivot value
            quickSort(a, pidx+1, high);
        }
    }



    public static void main(String[] args) 
    {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        
        System.out.print("Array Elements :  \n");
        display(arr);
        quickSort(arr, 0 , n-1);
        System.out.print("\nArray Sorted Using Counting Technique :   \n");
        display(arr);


    }    
}
