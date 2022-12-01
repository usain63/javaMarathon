package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        
        Figure[] figures = {new Triangle("Red", 10, 10, 10),
        new Triangle("Green", 10 , 20 ,30 ),
        new Triangle("Red", 10, 20, 15),
        new Rectangle("Red", 5, 10),
        new Rectangle("Orange", 40 ,15),
        new Circle("Red", 4),
        new Circle("Red", 10),
        new Circle("Blue", 5)};

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedAre(figures));
        
        }          
        
    public static double calculateRedPerimeter(Figure[] figures ) {
        double totalPerimeter = 0;
        
        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColour()))
                totalPerimeter+=figures[i].perimeter();
        }
        return totalPerimeter;
    }
    public static double calculateRedAre(Figure[] figures) {
        double totalArea = 0;
        
        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColour()))
                totalArea += figures[i].area();
        }
        return totalArea;
    }
}
