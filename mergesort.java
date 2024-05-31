public class mergesort
{
    void merger(int a[],int start,int mid,int end)
    {
        int i=start,j=mid+1;
        int t[ ]=new int[a.length];
        int ti=start;
        while(i<=mid && j<=end)
        {
            if(a[ i ]<a[ j ])
                t[ti++]=a[ i++ ];
            else
                t[ti++]=a[ j++ ];
        }
        while(i<=mid)
            t[ti++]=a[ i++ ];
        while(j<=end)
            t[ti++]=a[ j++ ];
        for(i=start;i<=end;i++)
            a[ i ]=t [ i ];
    }

    void mergesort(int a[],int start,int end)
    {
        if(start<end)//at most size 1
        {
            int mid=(start+end)/2;
            mergesort(a,start,mid);
            mergesort(a,mid+1,end);
            merger(a,start,mid,end);
        }
    }
    void print_Array(int a[])
    {
        System.out.println("Array has:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" , ");
        }
    }
    public static void main(String args[])
    {
        int a[]={12,44,22,66,77,10,89,19};
        mergesort obj=new mergesort();
        obj.mergesort(a,0,a.length-1);
        obj.print_Array(a);
    }


}