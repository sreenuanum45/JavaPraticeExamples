package JavaPratice;

public class PrimeCheck {
    public static void main(String[] args) {
        int number=13;
        boolean b=true;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                b=false;
            }
        }
        System.out.print(b ?"prime" :"not prime");
    }
}
