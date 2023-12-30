package src.basics_03_16Dec;

public class Lab_032_033_034_035 {
    public static void main(String[] args) {
        String name= "My name is Naveen";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        String name1 =new String("My name is NaveeN");

        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));

        String a=name.concat(name1);
        System.out.println(a);

        System.out.println(name instanceof String);
        System.out.println(name1 instanceof Object);
    }
}
