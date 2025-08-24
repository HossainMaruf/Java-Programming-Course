public class Parent {
   public Parent() {
    System.out.println("From Parent");
   } 
   public void displayText() {
    System.out.println("From displayText() function");
   }
}

class Child extends Parent {
    // displayText() is available
    public Child() {
        super();
    }
    public void displayInfo() {
        System.out.println("From displayInfo() function");
    }
}

class Main {
    public static void main(String[] args) {
    //    new Parent(); 
    // new Child(); // From Parent
       Child c = new Child();
    //    c.Parent(); // unavailable because Parent() is contructor, won't inherited
        c.displayText();
        c.displayInfo();
    }
}