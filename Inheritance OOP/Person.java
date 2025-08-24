public class Person {
    private String name;
    private int id;

    Person(String name, int id) { 
        this.name = name; this.id = id; 
        System.out.println("From Person");
    }
    String getName() { return name; }
    void setName(String name) { this.name = name; }
    int getId() { return id; }
    void setId(int id) { this.id = id; }
    void displayInfo() {
        System.out.println(name + "\t" + id);
    }
}

class Student extends Person {
    public Student(String name, int id) {
        // System.out.println("Student Constructor"); // ERROR
        super(name, id); // super() should be the first statement
        System.out.println("From Student");
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student("Maruf", 1001);
        s.displayInfo();
        s.setName("Hossain");
        s.setId(2001);
        System.out.println(s.getName());
        System.out.println(s.getId());
    }
}