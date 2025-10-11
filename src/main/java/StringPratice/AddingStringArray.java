package StringPratice;

public class AddingStringArray {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int Stack[]=new int[tokens.length];
        int x=-1;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")|tokens[i].equals("-")|tokens[i].equals("*")|tokens[i].equals("/"))
            {
                int a=Stack[x--];
                int b=Stack[x--];
                int result=0;
                switch(tokens[i]){
                    case"+":result=a+b;
                        break;
                    case"-":result=a-b;
                        break;
                    case"*":result=a*b;
                        break;
                    case"/":result=a/b;
                        break;
                }
                Stack[++x]=result;
            }
            else{
                Stack[++x]=Integer.parseInt(tokens[i]);
            }
        }
        System.out.println(Stack[x]);
    }
}
