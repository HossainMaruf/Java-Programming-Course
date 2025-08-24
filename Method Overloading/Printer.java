public class Printer {
   void print(int a) { System.out.println(a + " void print(int a)"); } 
   void print(float a) { System.out.println(a + " void print(float a)"); } 
   void print(double a) { System.out.println(a + " void print(double a)"); } 
   void print(char a) { System.out.println(a + " void print(char a)"); } 
   void print(int a, int b) { System.out.println("void print(int a, int b)"); }
   void print(float a, float b) { System.out.println("void print(float a, float b)"); }
   void print(double a, double b) { System.out.println("void print(double a, double b)"); }
   void print(char a, char b) { System.out.println("void print(char a, char b)"); }
}
class Main {
    public static void main(String[] args) {
       Printer p = new Printer(); 
       p.print(23);
       p.print(10.4);
       p.print(4.5F);
       p.print('m');
       p.print(10, 34);
       p.print(10.3, 213.234);
       p.print(34.2F, 23.2F);
       p.print('m', 'n');
    }
}
