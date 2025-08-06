package Arrays;

public class MaxConsecBits {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 1, 1, 1, 1,2,2,2,2,2,2,2};
        int pre=-1;
        int count=1;

        int maxcount=0;
        for(int a: arr){
            if(pre==a){
                count++;
            }
            else{
                maxcount=Math.max(maxcount,count);
                count=1;
            }
            pre=a;
        }
        System.out.println("max count:"+maxcount);
    }
}
