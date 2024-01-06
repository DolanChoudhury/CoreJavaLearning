package src.basics_06_24Dec;

public class Lab_098_099_100_101 {
    public static void main(String[] args) {
        //array
        int a[] = {1,3,5,7};
        System.out.println(a.length);
        System.out.println(a); //prints referance address

        //print elements of array
        for (int i=0;i <a.length;i++){
            System.out.println(a[i]);
        }

        //another way to declare array
        int b[] =new int[5];  //declares the length
        b[0]=3;
        b[1]=2;
        b[2]=4;
        b[3]=6;
        b[4]=8;
        for (int i=0;i <b.length;i++) {
            System.out.println(b[i]);
        }

        //final int b[]=new int[3] -------if we use final in front of array, it will fix the length of the array


        //two arrays have same values and different name are not equal as they have different reference/memory location
        int[]a1={1,2,3};
        int[]b1={1,2,3};

        System.out.println(a1==b1);
        System.out.println(a1==b1);
        System.out.println(a1.equals(b1)); //compares reference in case of string

        int[]c1=a1;  //will have same ref 
        System.out.println(a1.equals(c1));
        c1[1]=100;
        System.out.println(a1[1]);


    }
}
