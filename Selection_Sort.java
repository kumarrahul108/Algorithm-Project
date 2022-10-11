
// Selection Sort Algo

public class Selection_Sort 
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


    // selection sorting
    public static void selectioSort(int a[])
    {
        int n = a.length;

        // for traversal in array
        for(int i = 0; i<n;i++)
        {
            // assume 1st element as min value present in the array
            int midx = i;

            // for comparing the min value with remaining element present in the array
            for(int j = i+1;j<n;j++)
            {
                if(a[midx] > a[j])
                {
                    midx = j;
                }
            }
            // swap the initial element with element present at midx (min. index)
            int temp = a[midx];
            a[midx] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {7,8,3,1,2};
        
        System.out.print("\nArray Elements :   \n");
        display(arr);
        selectioSort(arr);
        System.out.print("\nArray Sorted Using Selection Technique   :   \n");
        display(arr);
    }    
}
