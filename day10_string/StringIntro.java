package day10_string;

import  java.util.Scanner;
import  java.lang.String;//automatically imported //only lang package
import  java.lang.System;//automatically imported// just for lang package

public class StringIntro {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String str="java";

        input.close();

        System.out.println("----------------------------");

        String s1="cat";
        String s2="dog";

        String s3="cat";
        String s4="cat";//creates same

        System.out.println(s3==s4);//!!!!!!!!!!!!!!!!!!!!!

        System.out.println("--------------------------------");

        String str1=new String("java");// creates 2 objects 1. in String pool, 2. in heap(outside string)
        String str2=new String("java");

        System.out.println(str1==str2);//!!!!!!!!!!!!

        System.out.println("-----------------------------");

        String t1="python";
        String t2=new String("python");
        String t3=new String("python");


        System.out.println(t1==t2);
        System.out.println(t2==t3);



    }
}
