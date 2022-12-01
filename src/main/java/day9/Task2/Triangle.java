package day9.Task2;

public class Triangle extends Figure{
  private double side1;
  private double side2;
  private double side3;
  
  public Triangle(String colour, double side1, double side2, double side3) {
    super(colour);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  @Override
  public double area() {
    double pp = perimeter()/2;
    return Math.sqrt(pp * (pp - side1) * (pp - side2) * (pp - side3));
  }

  @Override
  public double perimeter() {
    return side1 + side2 + side3;
  }
}
