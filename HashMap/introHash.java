package HashMap;

import java.util.HashMap;
import java.util.Map;

public class introHash {
    public static void main(String[] args) {
        HashMap <String, Integer> mp=new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Biswarup", 21);
        mp.put("Bipul", 21);
        mp.put("Elives", 21);

        System.out.println(mp.entrySet()); // [key=val] [Bipul=21, Elives=21, Biswarup=21, Akash=21]
        System.out.println(mp.values()); // values [21, 21, 21, 21]
        System.out.println(mp.keySet()); // keys [Bipul, Elives, Biswarup, Akash]

        mp.put("Biswarup", 7);
       System.out.println( mp.containsKey("Elives"));
       System.out.println( mp.containsKey("Rahul"));
       

        //add a new entry if does't exists
        mp.putIfAbsent("Rahul", 112);
        mp.remove("Akash");
        
        System.out.println(mp.entrySet());

        //Traverse HashMap

        for(String key: mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }

        for(var key: mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }

        for( Map.Entry<String,Integer> e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

  
    
}
