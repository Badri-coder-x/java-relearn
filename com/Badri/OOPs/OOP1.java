package com.Badri.OOPs;

public class OOP1 {

    public static void main(String[] args){
        //Here I am learning OOPs concepts
        //creating my own datastructures with class and objects
        //If you didn't initialize any constructor then it is by-default constructor


        Student krunal = new Student("Krunal", 25, 100.7f);
        Student randon = new Student();


        System.out.println(krunal.rno);
        System.out.println(krunal.name);
        System.out.println(krunal.marks);
        krunal.greeting();
        randon.greeting();


    }
}

class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello "+ name);
    }

    //by-default constructor for a random
    //this to call the other constructor
    Student(){
        this ("Random person",0,35.01f);
    }

    Student(String name,int rno ,float marks ){
        this.name = name;
        this.rno = rno;
        this.marks=  marks;
    }


}


