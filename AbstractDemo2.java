//Abstraction----->implementation
//abstract classes and methods

abstract class Vechicle{
  int no_wheels;
  abstract void start(); 
  void display(){
    System.out.println("I am abstract class here");
  }
}
class Car1 extends Vechicle{
  void start(){
    System.out.println("I start with key");
  }
}
class Scooter1 extends Vechicle{
  void start(){
    System.out.println("I start with kick");
  }
  void display(){
    System.out.println("I am abstract class here 5555");
  }
}
public class AbstractDemo2 extends Vechicle{
 
void start(){
    System.out.println("I start with button");
  }
  public static void main(String[] args){
    AbstractDemo2 obj=new AbstractDemo2();
    obj.start();
    Scooter1 obj1=new Scooter1();
    obj1.start();
    obj1.display();
  }
}