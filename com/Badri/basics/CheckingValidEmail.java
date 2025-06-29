package com.Badri.basics;

import java.util.Scanner;

public class CheckingValidEmail {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you email: ");
        String email= scanner.nextLine();

        if(email.contains("@")){
            System.out.println("Username: "+ email.substring(0,email.indexOf("@")));
            System.out.println("Domain: "+email.substring(email.indexOf("@")+1));

        }else{
            System.out.println("Entered email is not valid.");
        }

        scanner.close();
    }
}
