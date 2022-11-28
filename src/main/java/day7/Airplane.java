package day7;

public class Airplane {
  private String manufacturer;
  private int year;
  private int length;
  private int weight;
  private int fuel = 0;

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  public int getFuel() {
    return fuel;
  }
  
  Airplane(String manufacturer, int year, int length, int weight) {
    this.manufacturer = manufacturer;
    this.year = year;
    this.length = length;
    this.weight = weight;
  }
  
  void info () {
    System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " 
    + length + ", вес: " + ", количество топлива в баке: " + fuel);
  }
  
  void fillUp (int n) {
    fuel += n;
  }
  
  public static void compareAirplanes (Airplane plane1, Airplane plane2) {
    if (plane1.length > plane2.length)
      System.out.println("Cамолет " + plane1.toString() + " длиннее");
    else if (plane1.length < plane2.length)
      System.out.println("Cамолет " + plane2.toString() + " длиннее");
    else
      System.out.println("Самолеты одинаковой длины");
  }
  public String toString() {
    return this.manufacturer;
  }
}
