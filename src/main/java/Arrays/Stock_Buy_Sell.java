package Arrays;

public class Stock_Buy_Sell {
    public static void main(String[] args) {
        int []prices=new int[]{7, 10, 1, 3, 6, 9, 2};
        int res = 0;
        int res1=0;
        int maxProfit = 0;
        int  MaxLoss=0;
        int n=prices.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                res=Math.max(0,prices[j]-prices[i]);
                res1=Math.min(0,prices[j]-prices[i]);
                if(res>maxProfit){
                    maxProfit=res;
                }
                if(res1< MaxLoss){
                     MaxLoss=res1;
                }
            }
        }
        System.out.println("res:"+maxProfit);
        System.out.println("res:"+ MaxLoss);
    }
}
