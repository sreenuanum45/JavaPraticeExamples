package DailyCodingPratice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MaxCharOccurance {
    public static void main(String[] args) {
        String s="aaaaaaaaaaaaaaaaaaabbbbccccdddddddeeeeeeffffgggghhhhhhhhhhhhhhhhhhhgh";
        int maxcount=0;
        String maxchar="";
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)&& i!=j){
                    count++;
                }
            }
            if(count> maxcount){
                maxcount=count;
                maxchar=String.valueOf(s.charAt(i));
            }
        }
        System.out.println(maxchar+":"+maxcount);
    }
}
