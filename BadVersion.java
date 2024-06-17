package Interviews;

public class BadVersion
{
    private int bad;
    void setBadVersion(int version)
    {
        this.bad=version;
    }
    boolean isBadVersion(int version)
    {
        if(version>=bad)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        int versions[]={8,2,1,5,7,9,10};
        BadVersion obj=new BadVersion();
        obj.setBadVersion(3);
        int First_bad_version=versions[0];
        for(int i=1;i<versions.length;i++)
        {
            if(obj.isBadVersion(versions[i])==true && versions[i]<First_bad_version)
                First_bad_version=versions[i];
        }
        System.out.println("First bad Version used:"+First_bad_version);
    }
}
