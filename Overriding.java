//polymorphism
//Runtime polymorphism, dyanamic polymorphism, method overriding.

class Override{
  public void show(int a){
    int c=10*5;
    System.out.println("I am parent class method "+c);
  }
}
public class Overriding extends Override{
  public void show(int a){
    int c=10*5;
    System.out.println("I am overriden method "+c);
  }
  public static void main(String[] args){
    Override obj1=new Override();
    obj1.show(10);
    Overriding obj=new Overriding();
    obj.show(10);
  }
}