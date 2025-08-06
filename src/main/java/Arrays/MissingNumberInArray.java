package Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int []numbers={1,2,3,4,5,6,8};
        int n=numbers.length+1;
        int total=n*(n+1)/2;
        System.out.println("total:"+total);
        for(int num:numbers){
            total-=num;
        }
        System.out.println("missing number:"+total);
    }
}
