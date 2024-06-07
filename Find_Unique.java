package Interviews;

public class Find_Unique {
    public static void main(String args[]) {
        int array[] = {4,1,2,7,3,4,1,2};
        for (int i = 0; i < array.length; i++)
        {
            boolean flag = true;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] == array[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                System.out.print(array[i] + " Unique");
                break;
            }

        }
    }
}
