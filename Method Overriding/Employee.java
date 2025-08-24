public class Employee {
    private String name;
    private String empId;
    private float basicSalary;
    private float houseRent;
    private float medicalAllowance;
    Employee(String name, String empId, float basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
        this.houseRent = 0.5F * basicSalary;
        this.medicalAllowance = 0.3F * basicSalary;
    }
    float getBasicSalary() { return basicSalary; }
    float getHouseRent() { return houseRent; }
    float getMedicalAllowance() { return medicalAllowance; }
    float getTotalSalary() { return getBasicSalary() + getHouseRent() + getMedicalAllowance(); }
}

class FulltimeEmployee extends Employee {
    FulltimeEmployee(String name, String empId, float basicSalary) {
        super(name, empId, basicSalary);
    }
    // float getTotalSalary() { return getBasicSalary() + getHouseRent() + getMedicalAllowance() + 1000;  }
    float getTotalSalary() { return super.getTotalSalary() + 1000; }
}

class ParttimeEmployee extends Employee {
    ParttimeEmployee(String name, String empId, float basicSalary) {
        super(name, empId, basicSalary);
    }
}

class Main {
    public static void main(String[] args) {
    //    FulltimeEmployee full = new FulltimeEmployee("Maruf", "100", 1000);
    //    System.out.println(full.getTotalSalary()); // 2800
    //    ParttimeEmployee part = new ParttimeEmployee("Hossain", "200", 500);
    //    System.out.println(part.getTotalSalary()); // 900
        Employee e = new FulltimeEmployee("Maruf", "100", 1000); // upcasting
        /**
         * parent class reference but child class object
         */
        System.out.println(e.getTotalSalary());
    }
}
