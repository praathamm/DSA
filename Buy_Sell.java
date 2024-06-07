package Interviews;

public class Buy_Sell
{
   static int  process(int a[])
    {
        int i,j,max;
        max=0;//ref
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[j]-a[i]>max)
                {
                    //System.out.println("Buy on:"+ a[i]+" sell at:"+a[j]);
                    max=a[j]-a[i];
                }
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int a[]={1,2};
        System.out.println("Max profit is:"+process(a));

    }
}
