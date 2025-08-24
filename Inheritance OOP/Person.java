public class Person {
    private String name;
    private int id;

    // public Person(String name, int id) { this.name = name; this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}

class Student extends Person {
    // public Student(String name, int id) {
    //     System.out.println("Student Constructor"); // ERROR
    //     super(name, id); // super() should be the first statement
    // }
    /**
     * constructors are not inherited
     */
}

class Main {
    // Person p = new Person("Maruf", 101);
    // Student s = new Student("Hossain", 1001);
    Person p = new Person();
    Student s = new Student();
    p.setName("Maruf");
}