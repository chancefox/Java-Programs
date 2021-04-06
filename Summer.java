// Chance Fox
// CPSC 1061 - Lab 10
// April 5, 2021
// Description: This program does that same thing as the Cabin.java program does, but instead utilizes data
//              encapsulation and getter/setter methods to set the name, rate, and occupancy for each cabin.
//              This class also will calculate the price per person of each cabin.
class Summer {
// Create variables for the Summer class.
  private String name;
  private double rate;
  private int occupancy;
  static int nbOfCabins;

// We're going to use getter and setter methods to set/get the name
// rate, and occupancy for each cabin. Since the variables are private,
// we will need to use the getter/setter to read/change the variables.
  public void setName(String n) {
    this.name = n;
  } // setName()

  public void setRate(double r) {
    this.rate = r;
  } //setRate()

  public void setOccupancy(int o) {
    this.occupancy = o;
  } // setOccupancy()

  public void setNbOfCabins() {
    nbOfCabins++;
  } // setNbOfCabins()

  public String getName() {
    return name;
  } // getName()

  public double getRate() {
    return rate;
  } //getRate()

  public int getOccupancy() {
    return occupancy;
  } // getOccupancy()

  public int getNbOfCabins() {
    return nbOfCabins;
  } //getNbOfCabins()

// Divides the rate of the cabin by the number of occupants to determine the price per person.
  public double pricePerPerson() {
    return this.rate / this.occupancy;
  } // pricePerPerson()

} // Summer
