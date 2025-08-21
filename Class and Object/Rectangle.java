import java.util.Scanner;

public class Rectangle {
   float length; 
   float breadth;
   
   void setLength(final float l) {
     if(l < 0.0f) length = 0; 
     else length = l;
   }
   float getLength() { return length; }
   void setBreadth(final float b) {
     if(b < 0.0f) breadth = 0; 
     else breadth = b;
   }
   float getBreadth() { return breadth; }
}

class Main {
    public static void main(final String[] args) {
        final Rectangle r = new Rectangle();
        final Scanner input = new Scanner(System.in);
        r.setLength(input.nextFloat());
        r.setBreadth(input.nextFloat());
        input.close();
        System.out.println("Length = " + r.getLength());
        System.out.println("Breadth = " + r.getBreadth());
        System.out.println("Area = " + r.getLength() * r.getBreadth());
    }
}
