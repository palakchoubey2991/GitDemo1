package JavaInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String args[])
    {
        int arr[]={1,3,4,6,7,2};
        int target=9;
        int arr1[]=twosum(arr,target);
        System.out.println(Arrays.toString(arr1));

    }
    public static int[] twosum(int arr[],int target)
    {
        int remain=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            remain=target-arr[i];
            if(map.containsKey(remain)) {
                return new int[]{map.get(remain), i};
            }
            else
                map.put(arr[i],i);

        }
        System.out.println(map);


        return new int[]{0,0};
    }
}
