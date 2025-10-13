package DailyCodingPratice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CheckTheDigit {
    public static void main(String[] args) {
        boolean condtion=false;
        String s="anumandlasreenu45@gmail.com";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9' && Character.isDigit(s.charAt(i))){
                condtion=true;
                break;
            }
        }
        System.out.println(condtion);
    }
}