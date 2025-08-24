public class Parent {
    Parent() {
        System.out.println("From Parent");
    }
    void displayText() {
        System.out.println("From parent displayText()");
    }
}

class Child extends Parent {
    Child() {
        // System.out.println("From Child"); // ERROR
        super();
        System.out.println("From Child");
    }
    void displayInfo() {
        System.out.println("From parent displayInfo()");
    }
}

class Main {
    public static void main(String[] args) {
        // Parent p = new Parent();
        Child c = new Child(); // Again From Parent
        c.displayText();
        c.displayInfo();
    }
}