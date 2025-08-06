package Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int []prices=new int[]{7, 10, 1, 3, 6, 9, 2};
        int target=25;
        boolean b=false;
        for(int i=0;i<prices.length;i++){
            if(prices[i]==target){
               b=true;
               break;
            }
            else {
                b=false;
            }
        }
        System.out.println("target element:"+b);
    }
}
