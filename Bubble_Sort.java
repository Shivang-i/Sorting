// bubble Sort 
//Time Complexity:O(n^2)
//not good to use for competative coding
//Each element is compared with its adjacant elemnt and the larger one is shifted back
/*

   7,8,3,1,2
 * 7,8,3,1,2
 * 7,3,8,1,2
 * 7,3,1,8,2
 * 7,3,1,2,8            iteration 1 completed
 * 
 * 3,7,1,2,8
 * 3,1,7,2,8
 *3,1,2,7,8              iteation 2 completed
 * 
 * 1,3,2,7,8
 * 1,2,3,7,8            iteration 3 completed
 * 
 * 1,2,3,7,8            iteration 4 completed
 * 
 

 */


 
class Bubble_Sort
{

    public  static void printarray(int[] a)//since static is used no need for object creation
    {
        for (int i : a) {
            System.out.print(i+" ");
            
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,1,3,5,9};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //Swap
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarray(arr);
        
    }
}