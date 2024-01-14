package src.OOPS_07_30Dec;

public class Lab_125_printDiagonalElementOf2DArray {
    public static void main(String[] args) {

        int a[][] = new int[3][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 5;
        a[1][0] = 3;
        a[1][1] = 5;
        a[1][2] = 6;
        a[2][0] = 10;
        a[2][1] = 9;
        a[2][2] = 10;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][i]);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (i == j) {
                    System.out.print(a[i][j]+"\t");

                }
                else {
                    System.out.print("0"+"\t");
                }
            }
            System.out.println();

        }
    }
}
