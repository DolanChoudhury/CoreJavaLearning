package src.basics_03_16Dec;
import java.util.Scanner;
public class Lab_020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of a : ");
        int age_a = sc.nextInt();
        System.out.println("Enter age of b : ");

        int age_b = sc.nextInt();

    //relational operator
        boolean Compare = age_a >= age_b;
        System.out.println("Comparison result is " +Compare);
    }
}
