package Interviews;

public class Sliding_Window_Example
{
    static void min_max_window(int data[],int window_size)
    {
       // int front=0;

        //while(front<=data.length-window_size+1)//passes
        for(int front=0,rear=window_size-1;rear<=data.length-1;front++,rear++)
        {
            int min, max;
            min = max = data[front];//ref
            for (int i = front; i <= rear ; i++) {
                if (data[i] < min)
                    min = data[i];
                else if (data[i] > max)
                    max = data[i];
            }
            System.out.print("-"+min + "," + max );

        }
    }

    public static void main(String args[])
    {
        int data[]={10,3,12,50,40,15,60,1};
        int window_size=4;
        min_max_window(data,window_size);//3,50,3,50,12,50,15,60,1,60
                                         //3,50-3,50-12,50-15,60-1,60-1,60
    }
}
