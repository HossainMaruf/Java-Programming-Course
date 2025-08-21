import java.util.Scanner;

public class Employee { // public class name = Java File Name
    String name;
    int id;
    float salary;
}

class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // emp.name = "Hasibul Islam";
        // emp.id = 1010;
        // emp.salary = 9800.5f; // F
        /**
         * Taking User Input
         */
        Scanner input = new Scanner(System.in);
        emp.name = input.nextLine();
        emp.id = input.nextInt();
        emp.salary = input.nextFloat();
        input.close();
        System.out.println(emp.name);
        System.out.println(emp.id);
        System.out.println(emp.salary);
    }
}
