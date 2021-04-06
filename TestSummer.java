// Chance Fox
// CPSC 1061 - Lab 10
// April 4, 2021
// Description: This program will do everything the TestCabin program did, but instead, will
//              utilize the Summer class, which has set each data value as private, and set
//              and get values for each class. The TestSummer class then does what the
//              TestCabin class did, and calculates the price per night for each cabin using
//              the pricePerPerson() method in the Summer class, and then computes which cabin
//              has the lowest price per person, and then print the name and price of said cabin.
public class TestSummer {
  public static void main(String[] args) {
// Create variables.
    double x;
    double y;
    double z;
    double bestPrice;
    String bestCabin;
// Here, we'll use data encapsulation to set and get objects using the get() and set() methods.
// We will do this with 3 different created classes.
    // Blue Ridge Cabin, 600/night, 20 people, x per night.
    Summer blueRidge = new Summer();
    blueRidge.setName("Blue Ridge Cabin");
    blueRidge.setRate(600.00);
    blueRidge.setOccupancy(20);
    blueRidge.setNbOfCabins();
    x = blueRidge.pricePerPerson();
    System.out.println("The " + blueRidge.getName() + " costs $" + (int)blueRidge.getRate() + " per night and can lodge up to " + blueRidge.getOccupancy() + " persons. There are now " + blueRidge.getNbOfCabins() + " cabins in your database.");

    // Lazy Bear Cabin, 550/night, 10 people, y per night.
    Summer lazyBear = new Summer();
    lazyBear.setName("Lazy Bear Cabin");
    lazyBear.setRate(550.00);
    lazyBear.setOccupancy(10);
    lazyBear.setNbOfCabins();
    y = lazyBear.pricePerPerson();
    System.out.println("The " + lazyBear.getName() + " costs $" + (int)lazyBear.getRate() + " per night and can lodge up to " + lazyBear.getOccupancy() + " persons. There are now " + lazyBear.getNbOfCabins() + " cabins in your database.");

    // Wildcat Point Cabin, 450/night, 20 people, z per night.
    Summer wildcatPoint = new Summer();
    wildcatPoint.setName("Wildcat Point Cabin");
    wildcatPoint.setRate(450.00);
    wildcatPoint.setOccupancy(20);
    wildcatPoint.setNbOfCabins();
    z = wildcatPoint.pricePerPerson();
    System.out.println("The " + wildcatPoint.getName() + " costs $" + (int)wildcatPoint.getRate() + " per night and can lodge up to " + wildcatPoint.getOccupancy() + " persons. There are now " + wildcatPoint.getNbOfCabins() + " cabins in your database.");

    // Calculate the lowest price per person cabin.
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

    // Print out which cabin has the lowest price per person.
    System.out.println("The cabin with the best rate per person is " + bestCabin + " Cabin at $" + bestPrice + " a person.");
  } // main()
} // TestSummer()
