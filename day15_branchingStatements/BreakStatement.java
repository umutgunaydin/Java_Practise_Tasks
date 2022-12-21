package day15_branchingStatements;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){

            System.out.println(i);
            if (i==5){
                break;
            }

        }

        System.out.println("--------------------------------");


        for (char j='A';j<='Z';j++){

            if (j=='J'){
                break;
            }

            System.out.println(j);

        }

        for (;;){// infinite loop
            System.out.println("hello world");
            break;
        }


    }
}
