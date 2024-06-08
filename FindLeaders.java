package Interviews;

public class FindLeaders
{
    public static void main(String args[])
    {
        int array[]={16,17,4,3,5,2};
        for(int i=0;i<array.length;i++)
        {
            boolean flag=true;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]>array[i])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.print(array[i]+",");
        }
    }
}
