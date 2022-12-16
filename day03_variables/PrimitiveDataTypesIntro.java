package day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {

        // DataType variableName = Data ;

        byte a = 5; // byte takes -128 to 127 , cannot take decimal numbers such as 0,5
        // memory usage is 1 byte

        short b = 150; // it takes -32768 to 32767 , integer type
                        // memory usage is 2 bytes

        int c = 156; // most preferred one
                        // memory usage 4 bytes

        long d = 9999999999999L; // we need to use +L. otherwise it will be int
                                    // memory usage is 8 bytes

    //-------------------------------------------

        double x = 3.5; //preferred. memory usage 8 bytes

        float y =3.5F;  //we need to use +F, memory 4 bytes
    }
}
