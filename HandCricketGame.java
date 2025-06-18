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

            int compScore = 0, playerScore = 0;

            //if computer wins it chooses batting that is user must bowl first
            if(!isHead){
                System.out.println("Since Computer won you have to bowl first !!!");
                int stopFlag = 11, compRun= 0;
                while(true){

                    compRun = random.nextInt(1,11);
                    System.out.print("Enter the value: ");
                    stopFlag=sc.nextInt();

                    if(stopFlag != compRun){
                        compScore+=compRun;
                        System.out.println("- - - - Scoreboard - - - -");
                        System.out.println("Computer scored "+compRun+" runs...");
                        System.out.println("Computer's total score: "+compScore);
                    }
                    else {
                        System.out.println("- - - - Scoreboard - - - -");
                        System.out.println("Computer: "+compScore);
                        System.out.println("Wicket!!!! now player has to bat and choose the target "+compScore);
                        break;
                    }
                }

                int stopFlag2 = 11, userRun= 0;
                System.out.println();
                while(true){

                    System.out.print("Enter the value: ");
                    userRun=sc.nextInt();
                    stopFlag2 = random.nextInt(1,11);

                    if(stopFlag2 != userRun){
                        playerScore+=userRun;
                        System.out.println("- - - - Scoreboard - - - -");
                        System.out.println("Computer tried "+stopFlag2);
                        System.out.println("User scored "+userRun+" runs...");
                        System.out.println("User's total score: "+playerScore);
                    }
                    else {
                        if(playerScore<compScore) {
                            System.out.println("- - - - Scoreboard - - - -");
                            System.out.println("Computer tried "+stopFlag2);
                            System.out.println("User's total score: " + playerScore);
                            System.out.println("Wicket!!!! The player has to failed to score the target. Computer wins !!!");
                            break;
                        }
                        else if (playerScore==compScore){
                            System.out.println("- - - - Scoreboard - - - -");
                            System.out.println("Computer tried "+stopFlag2);
                            System.out.println("User's total score: " + playerScore);
                            System.out.println("Wicket!!!! The match is draw");
                            break;
                        }
                        else {
                            System.out.println("- - - - Scoreboard - - - -");
                            System.out.println("Computer tried "+stopFlag2);
                            System.out.println("User's total score: " + playerScore);
                            System.out.println("User won the match");
                            break;
                        }
                    }
                }



            }
            // finishing of a part...
            else{
                System.out.print("Enter whether you want first batting or bowling: ");
                String input2 = sc.nextLine();

                if(input2.toLowerCase()=="batting"){
                    int stopFlag2 = 11, userRun= 0;
                    System.out.println();
                    while(true){

                        System.out.print("Enter the value: ");
                        userRun=sc.nextInt();
                        stopFlag2 = random.nextInt(1,11);

                        if(stopFlag2 != userRun){
                            playerScore+=userRun;
                            System.out.println("- - - - Scoreboard - - - -");
                            System.out.println("Computer tried "+stopFlag2);
                            System.out.println("User scored "+userRun+" runs...");
                            System.out.println("User's total score: "+playerScore);
                        }
                        else {
                            if(playerScore<compScore) {
                                System.out.println("- - - - Scoreboard - - - -");
                                System.out.println("Computer tried "+stopFlag2);
                                System.out.println("User's total score: " + playerScore);
                                System.out.println("Wicket!!!! The player has to failed to score the target. Computer wins !!!");
                                break;
                            }
                            else if (playerScore==compScore){
                                System.out.println("- - - - Scoreboard - - - -");
                                System.out.println("Computer tried "+stopFlag2);
                                System.out.println("User's total score: " + playerScore);
                                System.out.println("Wicket!!!! The match is draw");
                                break;
                            }
                            else {
                                System.out.println("- - - - Scoreboard - - - -");
                                System.out.println("Computer tried "+stopFlag2);
                                System.out.println("User's total score: " + playerScore);
                                System.out.println("User won the match");
                                break;
                            }
                        }
                    }


                    System.out.println();
                    int stopFlag = 11, compRun= 0;
                    while(true){

                        compRun = random.nextInt(1,11);
                        System.out.print("Enter the value: ");
                        stopFlag=sc.nextInt();

                        if(stopFlag != compRun){
                            compScore+=compRun;
                            System.out.println("- - - - Scoreboard - - - -");
                            System.out.println("Computer scored "+compRun+" runs...");
                            System.out.println("Computer's total score: "+compScore);
                        }
                        else {
                            System.out.println("- - - - Scoreboard - - - -");
                            System.out.println("Computer: "+compScore);
                            System.out.println("Wicket!!!! now player has to bat and choose the target "+compScore);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("You chose to bowl first !!!");
                    int stopFlag = 11, compRun= 0;
                    while(true){

                        compRun = random.nextInt(1,11);
                        System.out.print("Enter the value: ");
                        stopFlag=sc.nextInt();

                        if(stopFlag != compRun){
                            compScore+=compRun;
                            System.out.println("- - - - Scoreboard - - - -");
                            System.out.println("Computer scored "+compRun+" runs...");
                            System.out.println("Computer's total score: "+compScore);
                        }
                        else {
                            System.out.println("- - - - Scoreboard - - - -");
                            System.out.println("Computer: "+compScore);
                            System.out.println("Wicket!!!! now player has to bat and choose the target "+compScore);
                            break;
                        }
                    }

                    int stopFlag2 = 11, userRun= 0;
                    System.out.println();
                    while(true){

                        System.out.print("Enter the value: ");
                        userRun=sc.nextInt();
                        stopFlag2 = random.nextInt(1,11);

                        if(stopFlag2 != userRun){
                            playerScore+=userRun;
                            System.out.println("- - - - Scoreboard - - - -");
                            System.out.println("Computer tried "+stopFlag2);
                            System.out.println("User scored "+userRun+" runs...");
                            System.out.println("User's total score: "+playerScore);
                        }
                        else {
                            if(playerScore<compScore) {
                                System.out.println("- - - - Scoreboard - - - -");
                                System.out.println("Computer tried "+stopFlag2);
                                System.out.println("User's total score: " + playerScore);
                                System.out.println("Wicket!!!! The player has to failed to score the target. Computer wins !!!");
                                break;
                            }
                            else if (playerScore==compScore){
                                System.out.println("- - - - Scoreboard - - - -");
                                System.out.println("Computer tried "+stopFlag2);
                                System.out.println("User's total score: " + playerScore);
                                System.out.println("Wicket!!!! The match is draw");
                                break;
                            }
                            else {
                                System.out.println("- - - - Scoreboard - - - -");
                                System.out.println("Computer tried "+stopFlag2);
                                System.out.println("User's total score: " + playerScore);
                                System.out.println("User won the match");
                                break;
                            }
                        }
                    }
                }
            }



        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }

    }

}
