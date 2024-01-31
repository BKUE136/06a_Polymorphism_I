package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        //create Object of each subclass
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        output(queen.doYourjob());
        output(queen.fly());
        output("---------------------------------------");

        output(worker.doYourjob());
        output(worker.fly());
        output("---------------------------------------");

        output(drone.doYourjob());
        output(drone.fly());
        output("---------------------------------------");

    }

   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

