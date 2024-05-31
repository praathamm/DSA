public class Searching{
    int mid;
    void bubble_sort(int a[]) {
        int i, j, t;
        boolean flag;
        for (i = a.length-1; i>0; i--)
        { flag=true;
        for (j = 0; j < i; j++) {
        if (a[j] > a[j + 1]) {
        flag=false;
        t = a[j];
        a[j] = a[j + 1];
        a[j + 1] = t;
        }
        }//j if(flag)//flag==true-----if true means no swap means sorted break;
        }
        }
    


    void selection_sort(int a[])
    {
    int min,pos,temp;
    for (int i=0;i<a.length;i++)
    { min=a[i];
    pos=i;
    for(int j=i+1;j<a.length;j++)
    {
    if(a[j]<min)
    {
    min=a[j];
    pos=j;
    }
    }
    temp = a[i];
    a[i] = a[pos];
    a[pos] = temp;
}
}

    void insertion_sort(int a[]) {
        int i, j, new_element;
        for (i = 0; i < a.length-1; i++)
        {
        new_element =a[i+1];
        j = i + 1;
        while (j > 0 && a[j - 1] > new_element) {
        a[j] = a[j-1];
        j--;
        }
        a[j] = new_element;
        }
        }
    

        void quick_sort(int a[ ],int start,int end)
        {
        int i,j,pivot;
        i=start;
        j=end;
        pivot=start;//start j:end while(i < j)
        {
        while(a[i]<a[pivot])
        i++;
        while(a[ j ]>a[pivot])
        j--;
        if(i<j)
        { int t=a[ i ];a[ i ]=a[ j ];a[ j ]=t;}
        }
        if(i<end)
        quick_sort(a,i+1,end);
        if(j>start)
        quick_sort(a,start,j-1);
        }



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



    int binary_search(int a[],int start,int end,int key)

    {
    
    if(start<=end)
    
    {
    
    int mid=(start+end)/2;
    
    if(a[mid]==key)
    
                   return(mid);//position
    
           else
    
                   {
    
                       if(key<a[mid])
    
                               return binary_search(a,start,mid-1,key);
    
                       else
    
                               return binary_search(a,mid+1,end,key);
    
                   }
    
    }
    
    else
    
           return(-1);
    
    }



    void print_Array(int a[])
{
System.out.println("Array has:");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" , ");
}
}
public static void main(String[] args) {
    int a[]={6,4,7,2,8,1,4,8};
Searching obj=new Searching();
//obj.mergesort(a,0,a.length-1); //obj.quick_sort(a,0,a.length-1); //obj.selection_sort(a); // // obj.insertion_sort(a); obj.bubble_sort(a);
// obj.insertion_sort(a);
obj.bubble_sort(a);
obj.print_Array(a);
// if(obj.binary_search(a, 0, 6, 100)==-1){
//     System.out.println("Not found");
// }else
//     System.out.println("Mila");
// }
}
}

//do merge sort later