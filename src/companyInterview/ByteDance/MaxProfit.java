package companyInterview.ByteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProfit {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>(Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(1,2,3,4),
                Arrays.asList(1,2,3,4),
                Arrays.asList(1,2,3,4)
        ));
        System.out.println(lists);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.set(1,1);
    }

    //LeetCode 121
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int res = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                if (res < price - minPrice) {
                    res = price - minPrice;
                }
            }
        }

        return res;
    }
    //LeetCode 122
    public static int maxProfit2(int[] prices){
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]){
                res += prices[i] - prices[i-1];
            }
        }
        return res;
    }

}
