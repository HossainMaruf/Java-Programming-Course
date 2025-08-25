public class Matcher {
   void max(int a, float b) { System.out.println("void max(int, float)"); } 
   void max(float a, int b) { System.out.println("void max(float, int)");}
   void max(double a, int  b) { System.out.println("void max(double, int)");}
   void max(int a, double b) {System.out.println("void max(int, double)");}
}

class Main {
    public static void main(String[] args) {
       Matcher m = new Matcher(); 
        // m.max(10, 10); // all 4 matched
        // m.max(10.4F, 10.3F); // nothing matching
        // byte b = 10;
        // m.max(b, 10);
        // m.max('m', 10);
        /**
         * Since double does not auto promote that's why it need to match exactly
         * Same for boolean type
         */
    }
}
