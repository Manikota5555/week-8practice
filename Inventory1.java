//Create a class called "Inventory" that represents a store's inventory. The class should have properties such as product name, quantity, and supplier, and methods such as getProductQuantity, setProductQuantity, and getProductSupplier. Create another class called "Order" that represents a store's order for products. The class should have a list of products to order, a supplier name, and methods such as addProductToOrder, removeProductFromOrder, and getSupplier.


import java.util.*;
class Inventory{
  String Name;
  int Quantity;
  String Suppliers;
  public Inventory(String Name, int Quantity, String Suppliers){
    this.Name=Name;
    this.Quantity=Quantity;
    this.Suppliers=Suppliers;
  }
  public String getName(){
    return Name;
  }
    public int getQuantity(){
      return Quantity;
    }
  public String getSupplier(){
    return Suppliers;
  }
}
class Order{
  ArrayList<Inventory>al=new ArrayList<Inventory>();
  
  void addInventory(Inventory i){
    al.add(i);
  }
  void removeInventory(String i){
    Iterator<Inventory>itr=al.iterator();
    while(itr.hasNext()){
    Inventory a=itr.next();
    if(a.getName().equals(i)){
      itr.remove();
    }
  }
  }
 public void DisplayAll(){
      for(Inventory x:al){
          System.out.println(x.getName() +" "+ x.getQuantity() +" "+ x.getSupplier());
        }
    }
}
public class Inventory1{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      Order i=new Order();

      int option=10;

      do
        {
           System.out.println("Enter 1 to add Inventory Name");
            System.out.println("ENter 2 to remove Inventory details");
           System.out.println("Enter 3 to view all Details");
          
           System.out.println("Enter 0 to Exit ");

          option=s.nextInt();

          switch(option)
            {
              case 1:{
                  s.nextLine();
                  
                  System.out.println("Enter Inventory Name");
                  String Name=s.nextLine();
                  
                  System.out.println("Enter Inventory Quantity");
                  int Quantity=s.nextInt();
                  s.nextLine();
                  System.out.println("Enter Inventory Suppliers");
                  String Suppliers=s.nextLine();

                  Inventory obj=new Inventory(Name, Quantity, Suppliers);

                  i.addInventory(obj);
                  System.out.println("Inventory Details added successfuly");
                  break;
                }
                case 2:{
                  s.nextLine();
                  System.out.println("Enter Inventory name to remove");
                  String name=s.nextLine();

                  i.removeInventory(name);
                    System.out.println("Inventory is removed successfully");
                  break;
                  
                }
                case 3:{
                  System.out.println("-----All Inventory Details are-----");
                  i.DisplayAll();
                  break;
                }
                
            }          
        }
        while (option !=0);
    }
  }