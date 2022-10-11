
// Bubble Sort Algo 

class Bubble_Sort 
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

    // bubble sorting 
    public static void bubbleSort(int a[])
    {
        // length of the array
        int n = a.length;  

        // for no. of passes
        for(int i = 0;i<n-1;i++)
        {
            // for no. of comparison
            for(int j = 0;j<(n-i-1);j++)
            {
                // checking whether element is larger at smaller index
                if(a[j] > a[j+1])
                {
                    // Swapping the elements
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    } 

    

    public static void main(String[] args) 
    {
        int arr[] = {7,8,3,1,2};

        System.out.print("Array Elemnets  :   \n");
        display(arr);
        bubbleSort(arr);
        System.out.print("\nArray Sorted Using Bubble Technique   :   \n");
        display(arr);
    }
}