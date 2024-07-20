package SeleniumPrac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCompare {
    public static void main(String args[])
    {
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("palak","nihar","puja"));
        System.out.println(list1);
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("palak","chetan","nihar","puja"));
        //list1.removeAll(list2);
        //System.out.println(list1);
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
