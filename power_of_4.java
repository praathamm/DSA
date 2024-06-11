package Interviews;

public class power_of_4
{
    boolean Check(int no)
    {
        for(int i=0; ;i++)
        {
            if(Math.pow(4,i)==no)
            {
                System.out.println("Match for 4 to power of "+i);
                return true;
            }

            else if(Math.pow(4,i)>no)
            {
                System.out.println("4 to power of "+i+" checked" );
                return false;
            }
        }
    }
    public static void main(String args[])
    {
        int no=1440;
        power_of_4 obj=new power_of_4();
        if (obj.Check(no)==true) {

            System.out.println(no + " Yes it is in power of 4");
        }
        else
            System.out.println(no+" it is not in power of 4");
    }
}
