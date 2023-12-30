package src.basics_03_16Dec;

public class Lab_028 {
    public static void main(String[] args) {
        int course = 200;
        float GST = 0.1845f;

        float total1 = course+ GST*course; //no data loss
        System.out.println(total1);


        int total2 = course + (int)GST*course;  //wrong since data is lossed when we store in smaller container(int)
        System.out.println(total2);
    }
}
