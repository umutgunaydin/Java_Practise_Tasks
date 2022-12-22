package day20_arraysUtilities_forEach;

import java.util.Arrays;

public class RemoveExtra {
    public static void main(String[] args) {

        String str="   hello world      i     love      java     ";

        str=str.trim();

        String[] words=str.split(" ");

        System.out.println(Arrays.toString(words));

        String result="";
        for (String each : words) {
            if (!each.equals("")){// it may be isEmpty() method!!!!!
                result+=each+" ";
            }
        }

        System.out.println("result = " + result);
    }
}
