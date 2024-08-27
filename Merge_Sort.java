public class Merge_Sort {
    
    
    public void merge(int a[],int beg,int mid,int end)
    {
        int i,j,k;
        int n1=mid-beg+1;
        int n2=end-mid;
        int LeftArray[]=new int[n1];
        int RightArray[]=new int[n2];
        for( i=0;i<n1;i++)
        {
            LeftArray[i]=a[beg+i];
        }
        for( i=0;i<n2;i++)
        {
            RightArray[i]=a[mid+1+i];
        }
        i=0;
        j=0;
        k=beg;
        while (i<n1&&j<n2) {
            if(LeftArray[i]<RightArray[j])
            {
                a[k]=LeftArray[i];
                i++;

            }
            else{
                a[k]=RightArray[j];
                j++;
            }
            k++;
            
        }
        while(i<n1)
        {
            a[k]=LeftArray[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=RightArray[j];
            j++;
            k++;
        }
        
    }

    public void sort(int a[],int beg, int end)
    {
        int mid=-1;
        if(beg<end)
        {
            mid=(beg+end)/2;
            sort(a,beg,mid);
            sort(a,mid+1,end);
            merge(a,beg,mid,end);

        }
    }
    public void printarray(int[] a)//since static is used no need for object creation
    {
        for (int i : a) {
            System.out.print(i+" ");
            
        }
        System.out.println();
    }
    public static void main(String arg[])
    {
        int a[]={38,27,43,10};
        int n=a.length;
        Merge_Sort obj=new Merge_Sort();
        obj.printarray(a);
        
        obj.sort(a,0,n-1);
        obj.printarray(a);
    }
}
