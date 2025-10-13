package DailyCodingPratice;

public class RemoveGivenChar {
    static void main() {
        char ch='e';
        String s="Anumandla sreenu";
        String removedString="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                removedString=removedString+ s.charAt(i);
            }
        }
        System.out.println(removedString);
        //replaced with ee to i
        System.out.println(s.replace("ee","i"));
    }
}
