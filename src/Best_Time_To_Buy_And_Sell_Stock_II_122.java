public class Best_Time_To_Buy_And_Sell_Stock_II_122 {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        //This is
        int res = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                res += prices[i] - prices[i-1];
            }
        }

        return res;
    }
}
