public class Trapezium {
   private float side1;
   private float side2;
   private float distance;
   Trapezium() { // setting default values
    side1 = 0.0f;
    side2 = 0.0f;
    distance = 0.0f;
   }
   public float getSide1() { return side1; }
   public void setSide1(float side1) { this.side1 = side1; }
   public float getSide2() { return side2; }
   public void setSide2(float side2) { this.side2 = side2; }
   public float getDistance() { return distance; }
   public void setDistance(float distance) { this.distance = distance; }
   public float getArea() { return (0.5f * (side1 + side2) * distance); }
}

class Main {
    public static void main(String[] args) {
        Trapezium t = new Trapezium();
        System.out.println(t.getArea());
    }
}
