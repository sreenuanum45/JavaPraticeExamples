package JavaPratice;

public class Fibonacci {
    public static void main(String[] args) {
        int n=5,a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.println(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
