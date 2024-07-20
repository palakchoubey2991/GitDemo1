package InterviewPrac;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String args[]) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("B", "C", "D"));
        Object s1[]=list1.toArray();
        Object s2[]=list2.toArray();
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s2.length;j++)
            {
                if(s1[i]==s2[j])
                {
                    System.out.println(s1[i]);
                }
            }
        }
    }
}
