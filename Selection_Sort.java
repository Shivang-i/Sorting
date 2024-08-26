/*Selection sort algorithm 
 * Time Complexity:O(n^2)
not good to use for competative coding.
In every iteration we select first element as the max/min element and then it is compared 
to every other element to find actual max/min element. and the the swapping of the elements 
took place.


data set:
13,10,24,56,11,7

7 10 24 56 11 13 //iteration 1
7 10 24 56 11 13 //iteration 2
7 10 11 56 24 13 //iteration 3
7 10 11 13 24 56 //iteration 4
7 10 11 13 24 56 //iteration 5


 */



public class Insertion_Sort {

    public  static void printarray(int[] a)//since static is used no need for object creation
    {
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int a[]={13,10,24,56,11,7};
        for(int i=0;i<a.length-1;i++)
        {
            int min =i;
            for(int j =i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;

        }
        printarray(a);
        
    }
    
}
