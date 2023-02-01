public abstract class fuel {
  protected String name;
  protected String fuelType;
  protected String fuelPrice;
  private static ArrayList<Fuel> FuelList = new ArrayList<>();

  public String getName() {
    return name;
  }

  public int getFuelType() {
    return fuelType;
  }

  public int getFuelPrice() {
    return fuelPrice;
  }
}