import java.util.Scanner;

public class MyMadLibsGame {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String myName = sc.nextLine();

        System.out.print("Enter a number: ");
        String age = sc.nextLine();

        System.out.print("Enter a Country: ");
        String country = sc.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = sc.nextLine();

        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();

        System.out.print("Enter a place: ");
        String place = sc.nextLine();

        System.out.print("Enter a food: ");
        String food = sc.nextLine();

        System.out.println("Hi, I am "+myName+" and I am "+age+" years old.");
        System.out.println("Tomorrow we are going to "+country+" to become a "+noun1+".");
        System.out.println(myName+" likes to "+verb+" in "+place+" and loves to have "+food+" as dinner.");

        sc.close();
    }
}
