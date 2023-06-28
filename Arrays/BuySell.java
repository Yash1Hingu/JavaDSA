package Arrays;
import java.util.*;
public class BuySell {
    public static int buysell(int stock[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0;i < stock.length;i++) {
            if(buyPrice < stock[i]) {
                int profit = stock[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            } else {
                buyPrice = stock[i];
            }
        }

        return maxProfit;
    }
    public static void main(String args[]) {
        int stock[] = {7,1,5,3,6,4};
        int profit = buysell(stock);
        System.out.println(profit);
    }
}
