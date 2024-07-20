package JavaInterviewQuestions;

public class FibonaciSeries {
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int c=0;
        System.out.println(b);
        while(c<8)
        {
            int sum=0;
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
            c++;
        }
    }
}
