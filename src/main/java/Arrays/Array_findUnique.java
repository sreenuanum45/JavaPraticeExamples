package Arrays;

public class Array_findUnique {
    public static void main(String[] args) {
        int numbers[] = new int[]{1, 2, 3, 3, 2, 1, 5,1,6};
        int n = numbers.length;
        int uniqueNumber = 0;
        int index_0fThat = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if(count==1){
              uniqueNumber=numbers[i];
              index_0fThat=i;
            }
            else {
                uniqueNumber=-1;
            }
        }
        System.out.println("unique number:"+uniqueNumber+"   "+index_0fThat);
    }
}
