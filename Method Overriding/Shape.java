public class Shape {
   private final float PI = 3.1416f;
   private int radius; 
   Shape(int radius) { this.radius = radius; }
   void setRadius(int radius) { this.radius = radius; }
   int getRadius() { return radius; }
   float getPI() { return PI; }
   float getArea() { return getPI() * getRadius() * getRadius(); }
}

class Circle extends Shape {
    Circle(int radius) { super(radius); }
}

class Sphere extends Shape {
    Sphere(int radius) { super(radius); }
    @Override
    float getArea() { return 4 * getPI() * getRadius() * getRadius(); }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.getArea());
        Sphere s = new Sphere(15);
        System.out.println(s.getArea());
    }
}
