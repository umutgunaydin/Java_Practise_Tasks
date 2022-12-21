package day16_doWhileAndNestedLoops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBCCCCDDDDD";
        char ch;

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j) && !result.contains("" + ch)) {
                    count++;
                }
            }

            if (!result.contains("" + ch)) {
                result += ch;
            } else {
                continue;
            }

            result += "" + count;

        }
        System.out.println("result = " + result);
    }
}
