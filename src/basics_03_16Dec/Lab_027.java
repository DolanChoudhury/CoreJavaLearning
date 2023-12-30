package src.basics_03_16Dec;

public class Lab_027 {
    public static void main(String[] args) {
        //type casting --moulding

        //implicit -- which happens when we change smaller data type to bigger. no need to mention

        int a =25;
        float b = a;  //widening
        System.out.println(b);

        //explicit type casting -- converting bigger data type into smaller
        int a1=300;
        byte b1= (byte) a1;  //narrowing
        System.out.println(b1);

        //int = 36 bits
        //byte = 8 bits
        //so int will be converted into 36 bits and only last 8 bits will be stored in byte. Other bits will be loosed/overflow

    }
}
