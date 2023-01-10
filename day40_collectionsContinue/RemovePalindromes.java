package day40_collectionsContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Java","Python","Car","Level","civic","radar","kayak","reviver","racecar","madam"));
        System.out.println(names);

        Iterator<String> iterator=names.iterator();

        while (iterator.hasNext()){
            String each=iterator.next();
            String reversedEach="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversedEach+=each.charAt(i);
            }
            if (each.equalsIgnoreCase(reversedEach)){
                iterator.remove();
            }
        }
        System.out.println(names);

        System.out.println("-------------------------");

        List<String> names2=new ArrayList<>();
        names2.addAll(Arrays.asList("Java","Python","Car","Level","civic","radar","kayak","reviver","racecar","madam"));
        System.out.println(names2);

        //names2.removeIf(p->p.equalsIgnoreCase(StringUtility.reverse(p)));
// rather than that we can use StringBuilder class
        names2.removeIf(p-> p.equalsIgnoreCase(new StringBuilder(p).reverse().toString()));


        System.out.println(names2);



    }
}
