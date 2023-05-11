//Inheritance
//Hiearchial
class Parent3{
  public void add(){
    System.out.println("I am Grand parent class method");
  }
}
class Child1 extends Parent3{
  public void multi(){
    System.out.println("I am parent class method");
  }
}
public class Ichild2 extends Parent3{
  public void sub(){
    System.out.println("I am child class method");
  }
  public static void main(String[] args){
    
    Ichild2 obj=new Ichild2();
    obj.sub();
    obj.add();
    Child1 obj1=new Child1();
    obj1.add();
    obj1.multi();
    
  }
}