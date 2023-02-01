import java.util.ArrayList;

public class Flights {
  protected String name, departureTime, arrivalTime, fuelType, reqFuel, flightPrice;
  private static ArrayList<Flights> flightsList = new ArrayList<>();

  public flights(String n, int d, int a, String f, Float f, Float p) {
    name = n;
    departureTime = d;
    arrivalTime = a;
    fuelType = f;
    reqFuel = r;
    flightPrice = p;
  }

  public String getName() {
    return name;
  }

  public int getDepartureTime() {
    return departureTime;
  }

  public int getArrivalTime() {
    return arrivalTime;
  }

  public String getFuelType() {
    return atk;
  }

  public Float getReqFuel() {
    return reqFuel;
  }

  public Float getFlightPrice() {
    return flightPrice;
  }

  public static ArrayList<Flights> getFlightsList() {
    return flightsList;
  }

  public void attack(Monster m) {
    int damage = (int) ((atk * atk) / (double) (atk + m.getDef())); 
// fix this area
  }
}