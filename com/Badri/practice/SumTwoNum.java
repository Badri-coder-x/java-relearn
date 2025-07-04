package com.Badri.practice;

import java.util.Scanner;

public class SumTwoNum {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("The sum of two number "+num1+ " and "+num2+" is: "+(num1+num2));
    }
}
