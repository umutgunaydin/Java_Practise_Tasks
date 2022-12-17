package day09_scanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan=new Scanner(Path.of("src/day09_scanner/Test.txt"));

        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

       // System.out.println(scan.hasNext());

        scan.close();
    }
}
