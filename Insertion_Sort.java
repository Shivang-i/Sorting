/*Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. It is a stable sorting algorithm, meaning that elements with equal values maintain their relative order in the sorted output.
 * 
 * Data set: 23,1,10,5,2
 * 
 * 23,1,10,5,2
 * 1,23,10,5,2
 * 1,10,23,5,2
 * 1,5,10,23,2
 * 1,2,5,10,23
 */

 class Insertion_Sort {
    
    public  static void printarray(int[] a)//since static is used no need for object creation
    {
        for (int i : a) {
            System.out.print(i+" ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={23,1,10,5,2};
        int n,i,j,key;
        n=a.length;
        System.out.println("Original Array: " );
        printarray(a);
        for(i=1;i<n;i++)
        {
            key=a[i];
            j=i-1;
            while(j>=0 &&a[j]>key)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        System.out.println("Sorted Array: " );
        printarray(a);
    }
    
}
