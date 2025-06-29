package com.Badri.practice;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){

        //To calculate Fibonacci Series up to n numbers.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fNum = 0, sNum = 1;

//        for(int i=0;i<n;i++){
//
//            System.out.print(fNum+" ");
//            int next = fNum + sNum;
//            fNum = sNum;
//            sNum = next;
//
//        }

        //If you want to find the nth element...
        for(int i=0;i<n;i++){

            int next = fNum + sNum;
            fNum = sNum;
            sNum = next;

        }
        System.out.println("The nth element = "+fNum);

    }
}
