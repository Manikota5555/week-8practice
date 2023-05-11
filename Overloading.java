//Compile time polymorphism,static polymorphism, method overloading.

public class Overloading{
  
  public void show(int a){
    System.out.println("I am method one "+a);
  }
  public void show(String b){
    System.out.println("I am method two "+b);
  }
  public static void main(String[] args){
    Overloading obj=new Overloading();
    obj.show(10);
    obj.show("mani");
  }
}