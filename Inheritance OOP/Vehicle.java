public class Vehicle {
    private int gear;
    private int cc;
    Vehicle(int gear, int cc) {
        this.gear = gear;
        this.cc = cc;
        System.out.println("From Vehicle");
    }
    void displayInfo() {
        System.out.println(gear + "\t" + cc);
    }
}

class Car extends Vehicle {
    Car(int gear, int cc) {
        super(gear, cc);
        System.out.println("From Car");
    }

}

class Motorbike extends Vehicle {
    Motorbike(int gear, int cc) {
        super(gear, cc);
        System.out.println("From Motorbike");
    }

}

class Main {
    public static void main(String[] args) {
       Car c = new Car(5, 400); 
       c.displayInfo();
       Motorbike m = new Motorbike(4, 150);
       m.displayInfo();
    }
}
