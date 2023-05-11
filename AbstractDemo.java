//Abstraction--->No implementation
//abstract classes and methods
abstract class Vehical{
  int no_Wheels;
  abstract void start();
}
class Car extends Vehical{
  void start(){
    System.out.println("I will start with key");
  }
}
class Scooter extends Vehical{
  void start(){
    System.out.println("I will start with kick");
  }
}
public class AbstractDemo extends Vehical{
  void start(){
    System.out.println(" I start with button");
  }
  public static void main (String[] args){
    AbstractDemo obj=new AbstractDemo();
    obj.start();
    Scooter obj1=new Scooter();
    obj1.start();
  }
}