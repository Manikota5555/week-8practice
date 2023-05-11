//Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost

import java.util.*;

class Dish {
  String name;
  double price;
  List<String> ingrediants;

  public Dish(String name, double price, List<String> ingrediants) {
    this.name = name;
    this.price = price;
    this.ingrediants = ingrediants;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public List<String> getIngrediants() {
    return ingrediants;
  }
}

class Restaurant {
  ArrayList<Dish> al = new ArrayList<Dish>();

  void addDish(Dish d) {
    al.add(d);
  }

  void removeDish(String d) {
    Iterator<Dish> itr = al.iterator();
    while (itr.hasNext()) {
      Dish a = itr.next();
      if (a.getName().equals(d)) {
        itr.remove();
      }
    }
  }

  void totalCost() {
    double total = 0;
    for (Dish x : al) {
     // System.out.println(x.getName() + " " + x.getPrice() + " " + x.getIngrediants());
      total+=x.getPrice();
    }
    System.out.println("the total cost of dishes "+total);
  }
  void displayAll(){
    for(Dish b:al){
      System.out.println(b.getName()+" "+b.getPrice());
    }
  }
}

public class Restaurant1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Restaurant d = new Restaurant();
    int option = 10;
    do {
      System.out.println("Enter 1 to add the Dish");
      System.out.println("Enter 2 to remove the Dish");
      System.out.println("Enter 3 to get the totalcost of Dish");
      System.out.println("Enter 4 to DisplayAll");
      System.out.println("Enter 0 to Exit");
      option = sc.nextInt();
      switch (option) {
        case 1: {
          sc.nextLine();
          System.out.println("Enter the Dish Name");
          String name = sc.nextLine();
          ArrayList<String> ingrediants=new ArrayList<String>();
          System.out.println("Enter how many Ingrediants if you want: ");
          int y = sc.nextInt();
          System.out.println("Enter the Ingrediants");
          for (int i = 0; i <= y; i++) { 
            String al = sc.nextLine();
            ingrediants.add(al);
          }
          System.out.println("Enter the Price");
          double price = sc.nextDouble();
          Dish obj = new Dish(name, price, ingrediants);
          d.addDish(obj);
          System.out.println("Dish is added successfully");
          break;
        }
        case 2: {
           sc.nextLine();
          System.out.println("Enter Dish name to remove");
          String name = sc.nextLine();
          d.removeDish(name);
          System.out.println("Dish is removed Successfully");
          break;
        }
        case 3: {
          System.out.println("total dish cost: ");
          d.totalCost();
          break;
        }
        case 4:{
          System.out.println("All the Dishes");
          d.displayAll();
          break;
        }
      }
    } while (option != 0);
  }
}