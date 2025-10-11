package Arrays;

public class SumOfSubArray {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9,10};
        System.out.println(SumOfSubArray(a));
        System.out.println(SumOfSubArray1(a));

    }
    public static int SumOfSubArray(int[]a){
        int currentSum=a[0];
        int sum=a[0];
        for(int i=1;i<a.length;i++){
            currentSum=Math.max(a[i],currentSum+a[i]);
            sum=Math.max(sum,currentSum);
        }
        return sum;
    }
    public static int SumOfSubArray1(int []a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
