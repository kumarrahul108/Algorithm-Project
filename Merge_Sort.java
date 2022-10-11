
// Merge Sort Algo

class Merge_Sort 
{

    // display
    public static void display(int a[])
    {
        int n = a.length;

        for(int i =0;i<n;i++)
        {
            System.out.print(a[i] + "  ");
        }
    }

    // to divide array elements into a single constituent 
    public static void divide(int a[],int si,int ei)
    {
        if(si >= ei)
        {
            return;
        }

        int mid = si + (ei-si)/2;
        divide(a, si, mid);
        divide(a, mid+1, ei);
        conquer(a,si,mid,ei);
    }


    // to merge our array
    public static void conquer(int a[],int si,int mid,int ei)
    {
        int merged[] = new int [ei-si+1];
        int idx1= si;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1<=mid && idx2<=ei)
        {
            if(a[idx1] <= a[idx2])
            {
                merged[x++] = a[idx1++];
            }
            else 
            {
                merged[x++] = a[idx2++];
            }
        }

        while(idx1 <= mid) 
        {
            merged[x++] = a[idx1++];
        }

        while(idx2 <= ei) 
        {
            merged[x++] = a[idx2++];
        }

        for(int i =0,j=si;i<merged.length;i++,j++)
        {
            a[j] = merged[i];
        }
    }


    public static void main(String[] args) 
    {
        int arr[]  = {6,3,9,5,2,8};
        System.out.println("Array Elements :   ");
        display(arr);
        int n = arr.length;   
        System.out.println("\nArray after Merge Sort :    ");
        divide(arr, 0, n-1);
        display(arr);
    }
}

