package day9.Task2;

public class Rectangle extends Figure{
  
  private double width;
  private double length;

  public Rectangle(String colour, double width, double length) {
    super(colour);
    this.width = width;
    this.length = length;
  }

  @Override
  public double area() {
    return width * length;
  }

  @Override
  public double perimeter() {
    return 2 * (width + length);
  }
}
