// Chance Fox
// CPSC 1061 - Lab 10
// April 1, 2021
// Description: TestCabin will create 3 different cabins in unisson with the Cabin.java
//              class and will give a name, rate, and occupancy total for each. The
//              class then Prints out each, and will call the Cabin class to determine
//              the price per person for each cabin. This class main will then calculate
//              which cabin has the lowest price per person and then display the name and said
//              price per person.


public class TestCabin {
  public static void main(String[] args) {
// Create variables.
    double x;
    double y;
    double z;
    double bestPrice;
    String bestCabin;
// Create three cabins with different attributes/prices and then get the price per person
// using the pricePerPerson() method.
    Cabin blueRidge = new Cabin("Blue Ridge", 600.00, 20);
    System.out.println("The " + blueRidge.name + " Cabin costs $" + (int)blueRidge.rate + " per night and can lodge up to " + blueRidge.occupancy + " persons. There are now " + Cabin.nbOfCabins + " cabins in your database.");
    x = blueRidge.pricePerPerson();
    Cabin lazyBear = new Cabin("Lazy Bear", 550.00, 10);
    System.out.println("The " + lazyBear.name + " Cabin costs $" + (int)lazyBear.rate + " per night and can lodge up to " + lazyBear.occupancy + " persons. There are now " + Cabin.nbOfCabins + " cabins in your database.");
    y = lazyBear.pricePerPerson();
    Cabin wildcatPoint = new Cabin("Wildcat Point", 450.00, 20);
    System.out.println("The " + wildcatPoint.name + " Cabin costs $" + (int)wildcatPoint.rate + " per night and can lodge up to " + wildcatPoint.occupancy + " persons. There are now " + Cabin.nbOfCabins + " cabins in your database.");
    z = wildcatPoint.pricePerPerson();

// Calculate which cabin has the lowest cost per person and then print out.
    if (x < y && x < z) { // If x has the lowest per person.
      bestPrice = x;
      bestCabin = "Blue Ridge";
    } else if (y < x && y < z) { // If y has the lowest per person.
      bestPrice = y;
      bestCabin = "Lazy Bear";
    } else { // If z has the lowest per person.
      bestPrice = z;
      bestCabin = "Wildcat Point";
    }

    System.out.println("The cabin with the best rate per person is " + bestCabin + " Cabin at $" + (int)bestPrice + " a person.");

  } //main()
} // TestCabin
