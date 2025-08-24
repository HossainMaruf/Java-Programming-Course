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



