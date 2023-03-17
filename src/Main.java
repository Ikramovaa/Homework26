import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       Map<String,Integer>map=new HashMap<>();
        map.put("ID:",93478);
        map.put("Biskek",1);
        map.put("God Vypuska:",2023);
        map.put("Cost",1000000);

       Map<String,String>map1=new HashMap<>();
       map1.put("Model","X");
       map1.put("colour:","White");
        for (Map.Entry m: map.entrySet()) {
            System.out.println(m.getKey());
        }
        System.out.println("===========================================");
        for (Map.Entry m: map.entrySet()) {
            System.out.println(m.getValue());
        }
        System.out.println("===========================================");
        Iterator<Map.Entry<String,Integer>>iterator1=map.entrySet().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        Iterator<Map.Entry<String,String>>iterator=map1.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}