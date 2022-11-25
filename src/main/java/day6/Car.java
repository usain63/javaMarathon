package day6;

public class Car {
  private String model;
  private String colour;
  private int year;

  public void setModel(String model) {
    this.model = model;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getModel() {
    return model;
  }

  public String getColour() {
    return colour;
  }

  public int getYear() {
    return year;
  }
  
  void info () {
    System.out.println("Это автомобиль");
  }
  
  int yearDifference (int inputYear) {
    if (inputYear > year)
      return inputYear - year;
    else 
      return year - inputYear;
  }
}
