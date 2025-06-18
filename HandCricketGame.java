import java.util.Random;
import java.util.Scanner;


public class HandCricketGame {
    public static void main(String[] args){

        //creating Scanner and Random Object
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        try {
            //Getting started
            System.out.print("You are heads, lets toss now");

            boolean isHead = random.nextBoolean();
            for (int i=1;i<=3;i++){
                Thread.sleep(1000);
                System.out.print(".");
            }
            System.out.print(" ");
            if (isHead){
                System.out.println("Its's heads, you won");
            }
            else {
                System.out.println("Its's tails, Computer won");
            }



        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }


    }
}
