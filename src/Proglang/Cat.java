package Proglang;
//use class and Objects, create class constructe, how use this 
public class Cat {

    public Cat(String name, int age, String color) {
    //Constructor 
    this.age=age;
    this.name=name;
    this.color=color;
    // System.out.println("New cat="+ name);
    // System.out.println("age="+ age);
    // System.out.println("color="+color );


    }
    String name;
    int age;
    String color;
    void eating(int food) {
        food++;

        System.out.println("eating "+ food+ " bowls");

    }
    void getcatparams() { 
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
        
        

    }
 public static void main(String[] args) {

    Cat mycat = new Cat("Murzik", 4 ,"black");
    Cat twocat = new Cat("Barsik", 5, "white");
    twocat.eating(6);
    mycat.eating(5);
    // mycat.name="Murzik";
    // mycat.age = 8;
    // mycat.color="Black"
    mycat.getcatparams();
    twocat.getcatparams();


    



     
 }


}