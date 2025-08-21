public class Triangle {
   float base;
   float height;
   void setBase(float base) {
        if(base < 0.0f) this.base = 0.0f;
        else this.base = base;
   } 
   float getBase() { return base; }
   void setHeight(float height) {
        if(height < 0.0f) this.height = 0.0f;
        else this.height = height;
   } 
   float getHeight() { return height; }
   float gerArea() { return base * height; }
}

class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();        
        t.setBase(10);
        t.setHeight(5);
        System.out.println(t.gerArea());

    }
}
