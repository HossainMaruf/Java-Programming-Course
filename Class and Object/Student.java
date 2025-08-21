public class Student {
    String name;
    int rollNumber;
    float marks;
}

class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Hasibul Islam";
        st.rollNumber = 1010;
        st.marks = 98.5f; // F
        System.out.println(st.name);
        System.out.println(st.rollNumber);
        System.out.println(st.marks);
    }
}