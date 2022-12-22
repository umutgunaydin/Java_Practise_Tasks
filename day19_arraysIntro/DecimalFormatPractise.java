package day19_arraysIntro;

import java.text.DecimalFormat;

public class DecimalFormatPractise {
    public static void main(String[] args) {

        DecimalFormat df=new DecimalFormat("0.000");

        double num1=10.34533535;
        System.out.println(num1);
        System.out.println(df.format(num1));

    }
}
