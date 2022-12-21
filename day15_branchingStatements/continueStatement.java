package day15_branchingStatements;

public class continueStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("------------------");

        for (int i = 10; i < 20; i++) {

            if (i%2==0){//it skips the even numbers
                continue;
            }

            System.out.println(i);
        }

        System.out.println("---------------------");

        for (char i ='A'; i <='G' ; i++) {

            if (i=='B'||i=='E'){
                continue;
            }
            System.out.println(i);

        }

    }
}
