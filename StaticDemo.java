//static method
//arthematic operator
import java.util.Scanner;

public class StaticDemo{ 
 //without parameter and without return type
  public static void add(){
    int a=10;
    int b=20;
    int c=a+b;
    System.out.println(c);
  }
  //with parameter and without return type
  public static void sub(int a, int b){
    int c=a-b;
     System.out.println(c);
  }
  //with parameter and with return type
  public static int multi(int a,int b){
    int c=a*b;
    return c;
  }
  //without any parameter and with return type
  public static int div(){
    int a=10;
    int b=5;
    int c=a/b;
    return c;
  }
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value");
    int a=sc.nextInt();
    System.out.println("Enter b value");
    int b=sc.nextInt();
    StaticDemo.add();
    StaticDemo.sub(a,b);
 
   int c=StaticDemo.multi(a,b);
    System.out.println(c);
 
    int c1=StaticDemo.div();
    System.out.println(c1);
  }
}