package JavaInterviewQuestions;

public class reverseString {
    public static void main(String args[])
    {
        String name="palak choubey";
        String fname[]=name.split(" ");

        String completename="";
        for (int i=0;i<fname.length;i++)
        {
            String s1=fname[i];
            String rname="";

            for(int j=0;j<s1.length();j++)
            {
               rname=s1.charAt(j)+rname;
            }
            completename=completename + rname+" ";
        }
        System.out.println(completename);

    }
}
