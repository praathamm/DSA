public class Buyandsell {
    public static void main(String[] args){
        int i,j=0;
    int [] prices={7,1,5,3,6,4};
    int max=0;
    for ( i = 0; i < prices.length; i++) {
        for ( j = i+j; j < prices.length; j++) {
            if(prices[j]-prices[i]>max){
                max=prices[j]-prices[i];
            }
            System.out.println("Maximum Profit is "+max);

        }

    }

    }
}
