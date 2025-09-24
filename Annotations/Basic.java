public class Basic {
    @Deprecated
    public void oldMethod() {
        System.out.println("From oldMethod");
    }
}

class Main {
    public static void main(String[] args) {
       Basic b = new Basic(); 
       b.oldMethod();
    }
}