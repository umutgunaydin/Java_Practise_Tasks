package day14_methodOverloading_loopsIntro;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println( reverse("umut"));
    }


    public static String reverse(String str){

        String reversed="";
        for (int i=str.length()-1;i>=0;i--){

            reversed+=""+str.charAt(i);

        }
       return reversed;
    }



}
