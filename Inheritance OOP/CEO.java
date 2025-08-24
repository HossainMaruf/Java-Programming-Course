class CEOMS {
    CEOMS() {
        System.out.println("CEO of MS");
    }
}
class CEOFB {
    CEOFB() {
        System.out.println("CEO of FB");
    }
}

class You extends CEOMS, CEOFB {
   // Compile Time Error 
}

class Main {
    public static void main(String[] args) {
        // Multiple Inheritance create the famous Diamond Problem        
        // Create ambiguity to the compiler, that's why it is not allowed
    }
}