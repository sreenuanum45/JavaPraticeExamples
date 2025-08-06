package Arrays;

public class TripletInArray {
    public static void main(String[] args) {
         //multiple of 3 number get the max product
        int[] arr = { 10, 3, 5, 6, 20 };
        int minproduct=Integer.MAX_VALUE;
        int maxproduct=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    minproduct=Math.min(minproduct,arr[i]*arr[j]*arr[k]);
                    maxproduct=Math.max(maxproduct,arr[i]*arr[j]*arr[k]);
                }
            }
        }
        System.out.println("minproduct:"+minproduct);
        System.out.println("max product:"+maxproduct);
    }
}
