package Arrays;

public class TripletInArray_1 {
    public static void main(String[] args) {
        int[] arr = {-10, -3, 5, 6, -20};
        int n=arr.length;
        int maxA = Integer.MIN_VALUE,
                maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
        int minC=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxA){
                maxA=arr[i];
                maxB=maxA;
                maxC=maxB;
            } else if (arr[i]>maxB) {
                maxB=arr[i];
                maxC=maxB;
            } else if (arr[i]>maxC) {
                maxC=arr[i];
            }
            if(arr[i]<minA){
                minA=arr[i];
                minB=minA;
                minC=minB;
            } else if (arr[i]<minB) {
                minB=arr[i];
                minC=minB;
            } else if (arr[i]<minC) {
                minC=arr[i];
            }

        }
        int maxProduct = Math.max(maxA * maxB * maxC, minA * minB * maxA);
        System.out.println(maxProduct);
    }
}
