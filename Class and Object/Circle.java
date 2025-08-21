import java.util.Scanner;

public class Circle {
   float radius; 
   final float PI = 3.1416f;
   void setRadius(float r) {
    if(r < 0.0f) radius = 0.0f;
    else radius = r;
   }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner input = new Scanner(System.in);
        // c.radius = input.nextFloat();
        /**
         * if else for data validation
         * best approach, use setter with validation logic
         */
        c.setRadius(input.nextFloat());
        input.close();
        System.out.println(c.radius);
        System.out.println("Area = " + c.PI*c.radius*c.radius);
    }
}
