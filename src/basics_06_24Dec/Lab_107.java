package src.basics_06_24Dec;

public class Lab_107 {
    public static void main(String[] args) {
    //Divisible by 3 --Fizz; Divisible by 6 --Buzz; Divisible by both--FizzBuzz
        //Both conditions should be written first
       for(int i=1;i<=20;i++){
           if(i%3==0 & i%6==0){
               System.out.println("fizzBuzz");
           }
           else if(i%3==0) {
               System.out.println("Fizz");
           }
           else if(i%6==0){
               System.out.println("Buzz");
           }
           else{
               System.out.println(i);
           }
       }


        int i=21;
        while(i<=30){
            if(i%3==0 & i%6==0){
                System.out.println("fizzBuzz");
            }
            else if(i%3==0) {
                System.out.println("Fizz");
            }
            else if(i%6==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }

            i++;
        }

    }
}
