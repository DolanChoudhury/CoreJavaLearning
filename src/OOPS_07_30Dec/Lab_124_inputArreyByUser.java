package src.OOPS_07_30Dec;

import java.util.Scanner;

public class Lab_124_inputArreyByUser {
    public static void main(String[] args) {
        //take user input array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        String[] Items=new String[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter the element at index " +i);
            Items[i]=sc.next();
        }
        for (int i=0;i<n;i++){
            System.out.println("The Array elements are");
            System.out.println(Items[i]);
        }
    }
}
