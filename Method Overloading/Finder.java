public class Finder {
   int max(int a, int b) { return a > b ? a : b; } 
   float max(float a, float b) { return a > b ? a : b; }
   double max(double a, double b) { return a > b ? a : b; }
   char max(char a, char b) { return a > b ? a : b; }

}
class Main {
    public static void main(String[] args) {
        Finder find = new Finder();
    }
}
