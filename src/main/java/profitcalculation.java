public class profitcalculation {
    static void main() {
        int[]prices=new int []{1,2,3,4,5,6,7,8,9};
        int maxprofit=0;
        int minprices=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length ; i++)
        {
            if(prices[i]<minprices){
                minprices=prices[i];
            }
            else{
                int profit=prices[i]-minprices;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
        System.out.println(maxprofit);
    }
}
