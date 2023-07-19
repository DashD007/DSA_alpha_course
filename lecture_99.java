public class lecture_99 {
    public static int buy_sell(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<price.length;i++){
            int sellprice = price[i];
            if(buyprice<sellprice){
                int profit = sellprice-buyprice;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buyprice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        // in this we will learn about the calculating of maximum profit from a stock price array;
        int price[] = {7,1,5,3,6,4};
        System.out.println(buy_sell(price));
    }
}
