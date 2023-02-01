import java.util.ArrayList;

public class Airports {
  protected String name, xValue, yValue, capacityAirplanes, capacityPeople, distance;
  private static ArrayList<Airports> AirportsList = new ArrayList<>();

  public flights(String n, int x, int y, Float d, int a, int p) {
    name = n;
    xValue = x;
    yValue = y;
    distance = d;
    capacityAirplanes = a;
    capacityPeople = p;
  }

  public String getName() {
    return name;
  }

  public int getXValue() {
    return xValue;
  }

  public int getYValue() {
    return yValue;
  }

  public int getDistance() {
    return distance;
  }

  public static ArrayList<Airplanes> getAirplanesList() {
    return airplanesList;
  }

  public static void distance(Airports a, Airports b){
   int distance = sqrt((a.getXValue()+b.getXValue()) * (a.getXValue()+b.getXValue()) + (a.getYValue()+b.getYValue())*(a.getYValue()+b.getYValue()) );
}