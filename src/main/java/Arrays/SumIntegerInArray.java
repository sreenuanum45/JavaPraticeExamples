package Arrays;

public class SumIntegerInArray {
    public static void main(String[] args) {
        String a[]={"10","@","1","+","$","%","100","1"};
        int sum=0;
        for(int i=0;i<a.length;i++){
            try{
                sum+=Integer.parseInt(a[i]);
            }catch(NumberFormatException e){

            }
        }
        System.out.println(sum);
        System.out.println(sumNumbers(a));
    }

    public static int sumNumbers( String a[]){
        int sum=0;
        for(String x:a){
            if(x.matches("\\d+")){
                sum+=Integer.parseInt(x);
            }
        }
        return sum;
    }
}
