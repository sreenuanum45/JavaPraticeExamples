package Arrays;

import java.util.Arrays;

public class AnnonumusArray {
    static int[] a = new int[1000];;
    public static void main(String[] args) {
        for(int j=0;j<args.length;j++){
            System.out.println("commandline_args:"+args[j]);
        }
        System.out.println("Total Sum:"+sum(new int[]{10,20,30}));
        int[] x = {10,20,30,40};
        char c ='c';
        int y=c;
String s="Sreenu";
System.out.println(s.length()+10l);
        System.out.println(Arrays.asList(a));
        System.out.println("char To Int:"+y);
    }
    public static int sum(int []x){
        int total=0;
        for(int i=0;i<x.length;i++){
            total+=x[i];
        }
        return total;
    }
}
