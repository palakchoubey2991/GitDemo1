package JavaInterviewQuestions;

public class removeSpecialChar {
    public static void main(String args[])
    {
        String name="##$#$aabbbccc$$9900";
        name=name.replaceAll("[^a-z]","");
        System.out.println(name);
    }
}
