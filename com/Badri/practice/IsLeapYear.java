package com.Badri.practice;

import java.util.Scanner;

public class IsLeapYear {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("The entered year "+year+" is a leap year.");
        }
        else{
            System.out.println("The entered year "+year+" is not a leap year.");
        }

    }
}
