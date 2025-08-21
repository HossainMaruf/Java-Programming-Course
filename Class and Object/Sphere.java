public class Sphere {
    private float radius;
    private final float PI = 3.1416f;
    Sphere(float radius) {
        this.radius = radius;
    }
    Sphere(Sphere s) {
        this.radius = s.radius;
    }
    void setRadius(float radius) { this.radius = radius; }
    float getRadius() { return radius; }
    float getSurfaceArea() { return 4 * PI * radius * radius; }
    float getVolume() { return (4/3.0f)*PI*radius*radius*radius; }
}

class Main {
    public static void main(String[] args) {
       Sphere s = new Sphere(12.4f); 
       System.out.println(s.getSurfaceArea());
       System.out.println(s.getVolume());
       Sphere copy = new Sphere(s);
       System.out.println(copy.getSurfaceArea());
       System.out.println(s.getVolume());
    }
}