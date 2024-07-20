public class testprac12 {
    public static void main(String args[])
    {
        String s1="abbdccc12345";
        String chars="";
        String nums="";
        for(int i=0;i<s1.length();i++)
        {

            if(Character.isDigit(s1.charAt(i)))
            {
                chars=chars+Character.getNumericValue(s1.charAt(i));
            }
            else
            if(!(Character.isDigit(s1.charAt(i))))

            {
                nums=nums+s1.charAt(i);
            }
        }
        System.out.println(chars);
        System.out.println(nums);
    }
}
