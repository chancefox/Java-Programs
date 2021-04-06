// Chance Fox
// CPSC 1061 - Lab 10
// April 1, 2021
// Description: This Cabin class will set the attributes of each cabin created.
//              The Cabin class also will use pricePerPerson() method to generate
//              the price per person of each class.

class Cabin {
// Create variables for the Cabin class.
  String name;
  double rate;
  int occupancy;
  static int nbOfCabins; // This is a static variable.

// Cabin() method is used when we create a new cabin. "this." will take the name, rate, and occupancy
// and set them to the variables we created above, so that the pricePerPerson() method can use them.
// Method then prints out the name, rate, and occupancy for the user.
  Cabin(String n, double r, int o) {
    name = n;
    rate = r;
    occupancy = o;
    nbOfCabins++; // Add 1 to nbOfCabin everytime this method is called and a new cabin is created.
  } // Cabin()

// Divides the rate of the cabin by the number of occupants to determine the price per person.
  double pricePerPerson() {
    return rate / occupancy;
  } // pricePerPerson()

} // Cabin
