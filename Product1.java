//Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.


import java.util.*;
 
class Product {
  String Name;
  double Price;
  int Quantity;
 
  public Product(String Name, double Price, int Quantity) {
    this.Name = Name;
    this.Price = Price;
    this.Quantity = Quantity;
 
  }
 
  public String getName() {
    return Name;
  }
 
  public double getPrice() {
    return Price;
  }
 
  public int getQuantity() {
    return Quantity;
  }
}
 
class PointOfSale {
  ArrayList<Product> al = new ArrayList<Product>();
 
  void addProduct(Product p) {
    al.add(p);
  }
 
  void removeProduct(String p) {
    for (Product a : al) {
      if (a.getName().equals(p)) {
        al.remove(a);
      }
    }
 
  }
 
  public void totalCost() {
    double total = 0;
    for (Product x : al) {
      total = total + x.getPrice();
    }
    System.out.println(total);
  }
 
  public void DisplayAll() {
   
    for (Product y : al) {
      System.out.println(y.getName() + " " + y.getPrice() + " " + y.getQuantity());
    }
  }
}
 
public class Product1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   PointOfSale p = new PointOfSale();
    
 
    int option = 10;
    do {
       
      System.out.println("Enter 1 to add product");
      System.out.println("Enter 2 to remove product");
      System.out.println("Enter 3 to get total cost of product");
      System.out.println("Enter 4 to view all product");
      System.out.println("Enter 0 to exit");
      option = s.nextInt();
 
      switch (option) {
        case 1: {
          s.nextLine();
          System.out.println("Enter product name");
          String name = s.nextLine();
          System.out.println("Enter product price");
          double price = s.nextDouble();
          System.out.println("Enter product qunitity");
          int quanitity = s.nextInt();
          Product obj = new Product(name, price, quanitity);
 
          p.addProduct(obj);
          System.out.println("product is successfully added");
          break;
        }
        case 2: {
          s.nextLine();
          System.out.println("Enter product name to remove");
          String name = s.nextLine();
          
          p.removeProduct(name);
          System.out.println("product is removed successfully");
          break;
 
        }
        case 3: {
          
          
          System.out.println("--------Total cost of products are----------");
          p.totalCost();
          break;
        }
        case 4: {
          
          System.out.println("--------All products are----------");
          p.DisplayAll();
          break;
        }
      }
 
    } while (option != 0);
  }
}