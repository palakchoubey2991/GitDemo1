package JavaInterviewQuestions;

import java.util.ArrayList;

public class ArrayCOmparison {
    public static void main(String args[])
    {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(20);
        list1.add(30);
        list1.add(40);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(50);
        list2.add(20);
        list2.add(70);
        for(int i=0;i<list1.size();i++)
        {
            for(int j=0;j<list2.size();j++)
            {
                if(!(list1.get(i)==list2.get(j)))
                {
                    System.out.println("the difference of the element is :"+ list1.get(i));
                }
            }
        }
    }
}
