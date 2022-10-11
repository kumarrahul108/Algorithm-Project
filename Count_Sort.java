
// Count Sort Algo

public class Count_Sort 
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


    // to calculate max. element present in the array
    public static int maximum(int a[])
    {
        int n = a.length;  // length of array
        int max = a[0];   //  asuuming 1st value as maximum (idx = 0) 

        // traverse the array from idx = 1 to length-1 
        for(int i = 1;i<n;i++)
        {
            // comparison of max with other array elements
            if(max < a[i])
            {
                max = a[i];
            }
        }

        return max;
    }


    // counting sorting 
    public static void countSort(int a[])
    {
        int n = a.length;    // length of array
        int m = maximum(a);  // get max value from array

        // create a count array of size = max + 1
        int count [] = new int[m+1];

        // assign each value = 0 in count array
        for(int i = 0;i< (m+1);i++)
        {
            count[i] = 0;
        }

        // incerement the corresponding index in count array
        // store the count of each element 
        for(int i =0;i< n;i++)
        {
            count[a[i]] = count[a[i]]  + 1;
        }

        int i = 0; // counter for count array
        int j = 0; // counter for main array

        // to put our main data --> according to condition of count array
        while(i <= m)
        {
            if(count[i] > 0)
            {
                a[j] = i;
                count[i] = count[i] - 1;
                j++;
            }
            else 
            {
                i++;
            }
        }
    }


    public static void main(String[] args) 
    {
        int arr[] = {7,8,3,1,2};

        System.out.print("\nArray Elements :   \n");
        display(arr);
        System.out.print("\nMax Element Present in the Array :   "  + maximum(arr));
        countSort(arr);
        System.out.print("\nArray Sorted Using Counting Technique :   \n");
        display(arr);

    }    
}
