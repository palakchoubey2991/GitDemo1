public class FactorialUsingRecurrsion {
    public static void main(String args[])
    {
        long num=60;
        System.out.println("The factorial value is :"+fact(num));

    }
    public static long fact(long n)
    {
        if(n==1)
        {
            return n;
        }
        return n*fact(n-1);
    }
}
