package Collections_Practice;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {
        Map<String ,Object>innermap=new HashMap();
        Map<String,Object> OuterMap=new HashMap();
        innermap.put("Sreenu",1);
        innermap.put("naveen",2);
        OuterMap.put("padma",innermap);
        OuterMap.put("sathaiah",3);
        //Printing the nested map
        OuterMap.keySet().forEach(c->System.out.println(c+" : "+OuterMap.get(c)));

    }
}
