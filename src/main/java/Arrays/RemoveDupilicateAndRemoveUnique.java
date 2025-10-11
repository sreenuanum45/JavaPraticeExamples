package Arrays;

import java.util.*;

class RemoveDupilicateAndRemoveUnique {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 3, 1, 2, 33, 3};
        removeDuplicates(a);
        System.out.println("=====unique values");
        RemoveUniqueValueFromArray(a);
    }

    public static void removeDuplicates(int[] a) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            unique.add(a[i]);
        }
        for (int n : unique) {
            System.out.println(n);
        }
    }
    public static void RemoveUniqueValueFromArray(int []a){
        Map<Integer,Integer>Duplicate=new HashMap<>();

        for(int i=0;i<a.length-1;i++){
            Duplicate.put(a[i],Duplicate.getOrDefault(a[i],0)+1);
        }
        for(int num: Duplicate.keySet()){
            if(Duplicate.get(num)>1){
                System.out.println(num);
            }
        }

    }
}




