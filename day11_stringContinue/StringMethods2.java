package day11_stringContinue;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence="ı love java, java is the best programming language, and java is in high demand.";
        String sentence2=sentence.replace("java","python");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        //-----------------------------------

        String word="java";
        String word2=word.replace('a','i');
        System.out.println("word = " + word);
        System.out.println("word2 = " + word2);

        //-----------------------------------------------------------

        String sentence5="i love java, java is cool";
        sentence5=sentence5.replaceFirst("java","phyton");//if you want to change the second use ", java"!!!
        System.out.println("sentence5 = " + sentence5);

        //-------------------------------------------

        String sentence6="i love java";
        String language=sentence6.substring(7,10+1);
        System.out.println("language = " + language);

        //--------------------------------------------

        String email="afafaf@gmail.com";
        int beginning=email.indexOf("@")+1;
        int ending=email.lastIndexOf(".");
        String domain=email.substring(beginning,ending);
        System.out.println("domain = " + domain);

        //---------------------------

        String sentence7="today is sunday, tomorrow is monday.";
        String tomorrow=sentence7.substring(sentence7.indexOf(" m")+1);
        System.out.println("tomorrow = " + tomorrow);

        //------------------------------

        String rpt="java";
        String result=rpt.repeat(10);
        System.out.println("result = " + result);

        


    }
}
