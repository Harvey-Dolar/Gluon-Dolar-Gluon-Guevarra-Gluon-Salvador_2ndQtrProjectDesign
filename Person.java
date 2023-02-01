public abstract class Person {
  private String name;
  private Location currentLocation;
  private int budget;
  private static ArrayList<Passenger> PassengerList = new ArrayList<>();

  public Person(String n) {
    this.name = n;
    this.currentLocation = null;
  }

  public Person(String n, Location l) {
    this.name = n;
    this.currentLocation = l;
  }

  public Person(String n, Location l, int b) {
    this.name = n;
    this.currentLocation = l;
    this.budget = b;
  }

  public String getName() {
    return name;
  }

  public Location getCurrentLocation() {
    return currentLocation;
  }

  public int getBudget() {
    return budget;
  }
}