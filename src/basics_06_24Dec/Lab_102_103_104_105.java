package src.basics_06_24Dec;

import java.util.Scanner;

public class Lab_102_103_104_105 {
    public static void main(String[] args) {
        String Names[]={"Mrinal","Jharna","Riya","Bishal"};
        int name_length=Names.length;
        for (int i=0;i<=name_length-1;i++) {
            System.out.println(Names[i]);
        }

            //take input of marks and print fail if marke<40
            Scanner sc= new Scanner(System.in);
            double Marks[]=new double[3];
            System.out.println("Enter marks obtained in English: ");
            Marks[0]=sc.nextDouble();
            System.out.println("Enter marks obtained in Maths: ");
            Marks[1]=sc.nextDouble();
            System.out.println("Enter marks obtained in Science: ");
            Marks[2]=sc.nextDouble();

            for (int j= 0; j<=Marks.length-1; j++)
            {
                System.out.println( "Your mark is " + Marks[j]);
                if (Marks[j]<40){
                    System.out.println("Your didn't pass");
                }
                else {
                    System.out.println("Well done!");
                }
            }

            sc.close();


    }
}
