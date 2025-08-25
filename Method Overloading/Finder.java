public class Finder {
    // 1
    // void F(short a) { System.out.println("short");}
    // void F(int a) { System.out.println("int");}
    // void F(long a) {System.out.println("long");}
    // void F(float a) {System.out.println("float");}
    // void F(double a) {System.out.println("double");}
    // 2
    // void F(int a) { System.out.println("int");}
    // void F(long a) {System.out.println("long");}
    // void F(float a) {System.out.println("float");}
    // void F(double a) {System.out.println("double");}
    // 3
    //   void F(int a) {System.out.println("int");}
    //   void F(long a) {System.out.println("long");}
    //   void F(float a) {System.out.println("float");}
    //   void F(double a) {System.out.println("double");}
    // 4
    //   void F(long a) {System.out.println("long");}
    //   void F(float a) {System.out.println("float");}
    //   void F(double a) {System.out.println("double");}
    // 5
    //   void F(float a) {System.out.println("float");}
    //   void F(double a) {System.out.println("double");}
    // 6
    // void F(double a) {System.out.println("double");}
}
class Main {
    public static void main(String[] args) {
        Finder find = new Finder();
        // byte b = 10;
        // find.F(b);
        // short s = 10;
        // find.F(s);
        // find.F('a');
        // find.F(10);
        // find.F(10L);
        // find.F(10.4F);
        // find.F(10.34); // No Promotion
        // boolean b = true;
        // find.F(b); // No Promotion because non numeric type
    }
}
