public class Man {
  void walk() {
    System.out.println("Man Walking");
  }  
  void eat() {
    System.out.println("Man Eating");
  }
  void talk() {
    System.out.println("Man Talking");
  }
}

class Singer extends Man {
    void sing() {
        System.out.println("Singing");
    }
    void talk() {
        System.out.println("Singer Talking");
    }
}
class Main {
    public static void main(String[] args) {
    //    Singer s = new Man(); # ERROR
        Man m = new Singer();
        m.eat();
        m.talk();
        m.walk();
        // Singer s = new Singer();
        ((Singer)m).sing();
        /**
         * Downcasting is tricky
         * When reference variable contain Singer object
         * then you can downcast to Man
         */
        /**
         * ClassCastException for below code
         */
        // Man m1 = new Man();
        // ((Singer)m1).sing();
        /**
         * s1 having the instance of Singer
         */
        Singer s1 = new Singer();
        ((Singer)s1).sing();
        /**
         * so before downcasting you should check that
         */
        if(m instanceof Singer) {
            ((Singer)m).sing();
        }
    }
}
