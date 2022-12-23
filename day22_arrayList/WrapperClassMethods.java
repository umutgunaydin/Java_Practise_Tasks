package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";

        int num1 = Integer.parseInt(str);// returns primitive
        //unboxing
        System.out.println(num1+1);

        Integer num2=Integer.valueOf(str);// returns wrapper class
        System.out.println(num2+4);

        System.out.println("---------------------");;

        String str2="20.5";

        double num3=Double.parseDouble(str2);
        System.out.println(num3);

        System.out.println("----------------------");

        String x="true";

        Boolean r1=Boolean.valueOf(x);
        System.out.println(!r1);

        System.out.println("------------------------");

        char ch ='1';
        boolean isDigit=Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);

        boolean isLetter=Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);

        boolean isLowerCase=Character.isLowerCase(ch);
        System.out.println("isLowerCase = " + isLowerCase);

        boolean isUpperCase=Character.isUpperCase(ch);
        System.out.println("isUpperCase = " + isUpperCase);

        boolean isSpecialChar=!Character.isLetterOrDigit(ch);// opposite of this is special!!
        System.out.println("isSpecialChar = " + isSpecialChar);


        System.out.println("-----------------------------");

        String string="a1b2c3d4e5";

        int sum=0;

        for (char each : string.toCharArray()) {
            if (Character.isDigit(each)){
                int number=Integer.parseInt(""+each);
                sum+=number;
            }
        }
        System.out.println("sum = " + sum);


    }

}
