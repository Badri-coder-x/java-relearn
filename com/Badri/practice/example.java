package com.Badri.practice;

public class example {

    public static  void main(String args[]){
        Car toyota = new Car();
        toyota.color = "pink";

    }
}
class Car{
    //attributes
    String manufacturer;
    String color;
    boolean isAC;
    int seatingCapacity;
    double weight;
    boolean isNavigatorPresent;

    //methods
    public void start(){
        System.out.println("Car is started");
    }

    public void stop(){
        System.out.println("Car is stopped");
    }

}
