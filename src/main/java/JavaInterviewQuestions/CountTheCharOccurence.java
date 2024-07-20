package JavaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharOccurence {
    public static void main(String args[])
    {
        String s1="aabbccddeeefffgggtttaa";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
                map.put(s1.charAt(i),1);
        }
        System.out.println(map);

    }
}
