package JavaPratice;

public class Factorial {
    public static void main(String[] args) {
        int n=19;
        Long fact= 1L;
        for(int j=1;j<=n;j++){
                fact=fact*j;
            }
            System.out.println("Factorial of "+n+" is "+fact);

    }

}
