package StringPratice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        String input="Sreenu";
        Map<Character,Long> result=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    result.entrySet().stream().filter(e->e.getValue()>1).forEach(e->System.out.println(e.getValue()+" "+e.getKey()));
    }
}
