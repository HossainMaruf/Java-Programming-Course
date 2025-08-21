public class User {
    private String name;
    private int id;
    User(String name, int id) {
        this.name = name;
        this.id = id;
    }
    // setter and getter of each field
    @Override
    public String toString() {
        return "User{name=" + name + ",id=" + id + "}"; 
    }
}

class Main {
    public static void main(String[] args) {
       User u1 = new User("Maruf", 1010); 
       User u2 = new User("Maruf", 1010); 
       System.out.println(u1.toString(u2));
    }
}


