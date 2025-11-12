package DailyCodingPratice;

public class IsCheckPrime {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=0;i<10;i++){
            if(isPrime(i)){
                sum=sum+i;
                count++;
            }
        }
        System.out.println("sum:"+sum);
        System.out.println("count:"+count);
        System.out.println(sum/count);
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        }
        if (num % 2 == 0) return false;

        for(int i=3;i<Math.sqrt(num)/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
