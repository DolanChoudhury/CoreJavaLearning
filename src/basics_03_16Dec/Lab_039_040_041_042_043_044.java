package src.basics_03_16Dec;

public class Lab_039_040_041_042_043_044 {
    public static void main(String[] args) {
        int a= 1;
        int b=4;
        int c=6;
        System.out.println(++a); // will increase a by 1 and print it
        System.out.println(a);
        System.out.println(a++); //will print previous value of a, but increase a by 1
        System.out.println(a);

        a=1;
        int sum=(++a + b++ + b++ - --c + c-- + --c);
        System.out.println(sum);
        //++a= 2.....a=2
        //b++=4......b=5
        //b++=5......b=6
        //--c=5......c=5
        //c--=4......c=4
        //--c=3......c=3
       }
}