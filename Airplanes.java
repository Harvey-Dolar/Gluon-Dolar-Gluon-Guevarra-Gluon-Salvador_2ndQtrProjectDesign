import java.util.ArrayList;

public class Airplanes {
  protected String name, fuelType, fuelPrice, planeCapacity;
  private static ArrayList<Airplanes> airplanesList = new ArrayList<>();

  public flights(String n, String t, int p, int c) {
    name = n;
    fuelType = t;
    fuelPrice = p;
    planeCapacity = c;
  }

  public String getName() {
    return name;
  }

  public String getFuelType() {
    return fuelType;
  }

  public int getFuelPrice() {
    return fuelPrice;
  }

  public int getPlaneCapacity() {
    return planeCapacity;
  }

  public static ArrayList<Airplanes> getAirplanesList() {
    return airplanesList;
  }

  public void attack(Monster m) {
    int damage = (int) ((atk * atk) / (double) (atk + m.getDef()));
    // fix this area
  }

  public static Monster selectMonster(String n) throws MonsterNotFoundException {
    boolean found = false;
    for (Monster m : monsterList) {
      if (m.getName().equals(n)) {
        found = true;
        return m;
      }
    }
    throw new MonsterNotFoundException("Monster doesn't exist");
  }

}