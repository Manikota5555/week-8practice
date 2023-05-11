//Create a class called "Customer" that represents a customer. The class should have properties such as name, address, and phone number, and methods such as getName, getAddress, and getPhoneNumber. Create another class called "Transaction" that represents a customer's purchase transaction. The class should have a list of products, a total cost, and methods such as addProduct, removeProduct, and getTransactionTotal.


import java.util.*;
class Customer{
  String Name;
  String Address;
  long PhoneNumber;
  double Price;
public Customer(String Name, String Address, long PhoneNumber,double Price){
  this.Name=Name;
  this.Address=Address;
  this.PhoneNumber=PhoneNumber;
  this.Price=Price;
}
  public String getName(){
    return Name;
  }
  public String getAddress(){
    return Address;
  }
  public long getPhoneNumber(){
    return PhoneNumber;
  }
  public double getPrice(){
    return Price;
  }
}
 class Customer1{
  ArrayList<Customer>al=new ArrayList<Customer>();

   void addCustomer(Customer p){
     al.add(p);
   }
   void removeCustomer(String p){
     Iterator<Customer>itr=al.iterator();
    while(itr.hasNext()){
    Customer a=itr.next();
    if(a.getName().equals(p)){
      itr.remove();
    }
  }
   }
   public void totalCost(){
     double total=0;
     for(Customer x:al){
       total=total+x.getPrice();
     }
     System.out.println(total);
   }
   public void DisplayAll(){
     for (Customer y:al){
       System.out.println(y.getName()+" "+y.getAddress()+" "+y.getPhoneNumber());
     }
   }
}
public class Transaction{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    Customer1 p=new Customer1();

    int option=10;
    do{
       System.out.println("Enter 1 to add Customer");
      System.out.println("Enter 2 to remove Customer ");
      System.out.println("Enter 3 to Customer Transaction");
      System.out.println("Enter 4 to view all product");
      System.out.println("Enter 0 to exit");
      option = s.nextInt();

      switch(option){
          case 1: {
          s.nextLine();
          System.out.println("Enter Customer name");
          String Name = s.nextLine();
          System.out.println("Enter Customer address");
          String Address = s.nextLine();
          System.out.println("Enter Customer phonenumber");
          long PhoneNumber = s.nextLong();
          Customer obj=new Customer(Name, Address, PhoneNumber,10.0);
          p.addCustomer(obj);
          System.out.println("Customer details are successfully added");
          break;
        }
        case 2: {
          s.nextLine();
          System.out.println("Enter the customer name to remove");
          String name=s.nextLine();
          p.removeCustomer(name);
          System.out.println("Customer is removed Successfully");
          break;
        }
        case 3: {
          System.out.println("Total Customer Transaction are");
          p.totalCost();
          break;
        }
        case 4: {
          System.out.println("All the Customer are");
          p.DisplayAll();
          break;
        }
      }
    }while(option!=0);
  }
}