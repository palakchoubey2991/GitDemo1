package JavaInterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String args[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(100,1);
        map.put(200,2);
        map.put(300,3);
        map.put(400,4);
        System.out.println(map);
        System.out.println("The keys in hashmap are **  "+map.keySet());
        System.out.println("The values in Map are ***  "+map.values());
        System.out.println("The key value pair of Map is ***"+map.entrySet());

        Set s1=map.entrySet();
        Iterator itr=s1.iterator();
        while (itr.hasNext())
        {
            System.out.println("the key and value of the map are "+itr.next());
        }
        while(itr.hasNext())
        {
            Map.Entry m1=(Map.Entry) itr.next();
            if(m1.getKey().equals(400))
            {
                System.out.println("the map valye is "+m1.getValue());
                m1.setValue(44);

            }
        }
       System.out.println(map);
    }
}
