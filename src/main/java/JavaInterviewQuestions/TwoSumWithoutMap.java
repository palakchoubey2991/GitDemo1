package JavaInterviewQuestions;

import java.util.Arrays;

public class TwoSumWithoutMap {

    public static void main(String args[])
    {
        int arr[]={1,3,5,6,7,2};
        int target=8;
        int arr2[]=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {

                     arr2[0]=i;
                     arr2[1]=j;
                     break;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
