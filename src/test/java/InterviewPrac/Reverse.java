package InterviewPrac;

public class Reverse {
    public static void main(String args[])
    {
        String s1="palak";
        String s="";
        for(int i=0;i<s1.length();i++)
        {
            s=s+s1.charAt(i);
        }
        System.out.println(s);
    }
}
