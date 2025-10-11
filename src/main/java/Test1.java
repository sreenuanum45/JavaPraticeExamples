import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
    static void main(String[] args) {
        int b[]={10,20,30,40,50};
        boolean paliondrome=false ;
        int even = 0;
        int odd = 0;
        int first = Integer.MIN_VALUE, second =Integer.MIN_VALUE ;
        HashMap<Integer, Integer> map = new HashMap<>();
        int target = 40;
        Scanner scn = new Scanner(System.in);
        System.out.println("array size enter number:");
        int n=scn.nextInt();
        int a[] = new int[n];
        for (int i=0;i<a.length;i++){
            System.out.println("enter number:"+i);
            a[i] = scn.nextInt();
        }
        System.out.println(a.length);
        int max = a[0];
        int min = a[0];
        int sum = 0;
        for (int y : a) {
            if (y > first) {
                first = y;
            } else if (y > second && y != first) {
                second = y;
            }
            map.put(y,map.getOrDefault(y,0)+1);
            if (y % 2 == 0) even++;
            else odd++;
            if (y > max) max = y;
            if (y < min) min = y;
            sum += y;
        }
        System.out.println("sum of array:"+sum);
        System.out.println("maximum value:" + max);
        System.out.println("minimum value in the array:" + min);
        System.out.println("even number in the count:"+even);
        System.out.println("odd number count:"+odd);
        System.out.println("first maximum:"+first);
        System.out.println("Second maximum:"+second);
        for (int z : a) {
            if (z == target) {
                System.out.println("found target number in the array:" + z);
            }
        }
        for (int key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        //cheecking palindrome
        for(int i=0;i<a.length/2;i++){
            if(a[i]!=a[a.length-1-i])paliondrome=false;
            else {
                paliondrome=true;
            }
        }
        System.out.println("array is the palindrome:"+paliondrome);
        //merge arrays
        int result[]=new int[a.length + b.length];
        System.arraycopy(a,0,result,0,a.length);
      System.arraycopy(b,0,result,a.length,b.length);
      System.out.println(result.length);
    }
}
