package StringPratice;

public class WordsCountFinding {
    static void main(String[] args) {
        String sentence = "India is my country. My country is India.";
        sentence = sentence.replace(".", "");

        String[]words=sentence.split(" ");
        boolean[]visited=new boolean[words.length];
        for(int i=0;i<words.length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    count++;
                    visited[j]=true;
                    j++;
                }
            }

            System.out.println(words[i] + ": " + count);
        }
    }
}
