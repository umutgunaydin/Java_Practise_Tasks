package day28_OOP_Encapsulation;

public class Student {

    private String name;
    private int age;


    public String getName() {
        if (name == null) {
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }
        if (hasDigit) {
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }

        this.name = name;
    }


    public int getAge() {
        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1);// 1 means there is sth wrong
        }
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 100) {
            System.err.println("Invalid age: " + age);
            //return;// exits method
            System.exit(1);//terminate program
        }


        this.age = age;
    }

}
