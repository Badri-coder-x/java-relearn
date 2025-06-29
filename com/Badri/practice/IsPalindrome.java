package com.Badri.practice;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args){

        //To calculate Fibonacci Series up to n numbers.
        Scanner sc = new Scanner(System.in);
        String myStr = sc.next();

        String tempStr = "";
        for(int i =myStr.length()-1;i>=0;i--){
            tempStr += myStr.charAt(i);
        }

        //System.out.println(tempStr);

        if(myStr.equals(tempStr)){
            System.out.println("Entered string is palindrome");
        }
        else{
            System.out.println("Entered string is not a palindrome");
        }

    }
}
