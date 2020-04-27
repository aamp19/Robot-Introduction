import java.util.Scanner;

public class Robot{
    String name;
    String model;
    int weight;


public Robot(String n,String m,int w){
    this.name = n;
    this.model = m;
    this.weight = w;
}

public void OutputInformation(){
    System.out.println("My name is "+this.name);
    System.out.println("My model is "+this.model);
    System.out.println("My weight is "+this.weight);
    System.out.println("");
}

public static void main(String [] args){
    Robot v1 = new Robot("Marty","Excel version 2.0",170);
    Robot v2 = new Robot("Snoozeman","30% Model",170);
    v1.OutputInformation();
    v2.OutputInformation();

    }
}

