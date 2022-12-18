package day11_stringContinue;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "HELLO WORLD";
        str1 = str1.toLowerCase();// hello world// new object created
        System.out.println("str1 = " + str1);

        //----------------------------------------------

        String str2 = "java programming";
        String str3 = str2.toUpperCase();
        System.out.println("str3 = " + str3);

        //----------------------------------------

        String word1 = "WoodenSpoon";
        String word2 = word1.toUpperCase();
        System.out.println("word2 = " + word2);

        //----------------------------------------

        String str4 = "                       Hello World";//white spaces
        String str5 = str4.trim();// use it for removing spaces
        System.out.println("str4 = " + str4);
        System.out.println("str5 = " + str5);

        //------------------------------------------

        String sentence1="today is sunday, and we have java class.";
        int index1= sentence1.indexOf('w');
        System.out.println("index1 = " + index1);

        int firstA=sentence1.indexOf('a');
        System.out.println("firstA = " + firstA);

        int secondA=sentence1.indexOf("a ");
        System.out.println("secondA = " + secondA);

        String s2="java python javascript world";
        int a1=s2.indexOf('a');
        System.out.println("a1 = " + a1);

        int a2=s2.indexOf("a python");
        System.out.println("a2 = " + a2);

        int a3=s2.indexOf("avas");

        //--------------------------

        String w="java";
        int lastA=w.lastIndexOf('a');
        System.out.println("lastA = " + lastA);

        //-------------------------------





    }
}
