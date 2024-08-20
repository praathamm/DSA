package testday5;

import java.util.*;

public class numtoword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt(); //123

        if (a < 999) {
            int firstdigit = a / 100;
            int last2digits = a % 100;
            int seconddigit = last2digits / 10;
            int lastdigit = last2digits % 10;
            // System.out.println(firstdigit);//7
            // System.out.println(last2digits);//89
            // System.out.println(seconddigit);//8
            // System.out.println(lastdigit);//9

            switch (firstdigit) {
                case 1:
                    System.out.print("One Hundred");
                    break;
                case 2:
                    System.out.print("Two Hundred");
                    break;
                case 3:
                    System.out.print("Three Hundred");
                    break;
                case 4:
                    System.out.print("Four Hundred");
                    break;
                case 5:
                    System.out.print("Five Hundred");
                    break;
                case 6:
                    System.out.print("Six Hundred");
                    break;
                case 7:
                    System.out.print("Seven Hundred");
                    break;
                case 8:
                    System.out.print("Eight Hundred");
                    break;
                case 9:
                    System.out.print("Nine Hundred");
                    break;

            }

            switch (seconddigit) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print(" and Twenty");
                    break;
                case 3:
                    System.out.print(" and Thirty");
                    break;
                case 4:
                    System.out.print(" and Forty");
                    break;
                case 5:
                    System.out.print(" and Fifty");
                    break;
                case 6:
                    System.out.print(" and Sixty");
                    break;
                case 7:
                    System.out.print(" and Seventy");
                    break;
                case 8:
                    System.out.print(" and Eighty");
                    break;
                case 9:
                    System.out.print(" and Ninety");
                    break;

            }

            switch (lastdigit) {
                case 1:
                    System.out.print(" One");
                    break;
                case 2:
                    System.out.print(" Two");
                    break;
                case 3:
                    System.out.print(" Three");
                    break;
                case 4:
                    System.out.print(" Four");
                    break;
                case 5:
                    System.out.print(" Five");
                    break;
                case 6:
                    System.out.print(" Six");
                    break;
                case 7:
                    System.out.print(" Seven");
                    break;
                case 8:
                    System.out.print(" Eight");
                    break;
                case 9:
                    System.out.print(" Nine");
                    break;

            }

            if (firstdigit == 1) {
                System.out.print("One Hundred");
            }
            if (seconddigit == 2) {
                System.out.print(" and Twenty");
            }
            if (lastdigit == 3) {
                System.out.print(" Three");
            }
        }

    }
}
