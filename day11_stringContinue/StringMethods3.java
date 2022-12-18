package day11_stringContinue;

public class StringMethods3 {
    public static void main(String[] args) {

        String word="wooden spoon";
        boolean r1=word.isEmpty();
        System.out.println("r1 = " + r1);

        //------------------------------

        String str="               ";
        boolean r2=str.isEmpty();
        boolean r3=str.isBlank();
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //--------------------------------

        String students="ahmet mehmet ali veli";
        boolean hasAli=students.contains("ali");//case sensitive
        System.out.println("hasAli = " + hasAli);

        //-----------------------------------------------

        String url="www.google.com";
        boolean isValid=url.startsWith("www");
        System.out.println("isValid = " + isValid);

        boolean t=url.endsWith(".com");
        System.out.println("t = " + t);

    }
}
