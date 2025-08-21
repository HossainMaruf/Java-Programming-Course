public class Car {
   private String brand; 
   private String series;
   private int cc;
   private int mileage;
   Car(String brand, String series, int cc, int mileage) {
        this.brand = brand;
        this.series = series;
        this.cc = cc;
        this.mileage = mileage;
   }
   public String getBrand() { return brand; }
   public void setBrand(String brand) { this.brand = brand; }
   public String getSeries() { return series; }
   public void setSeries(String series) { this.series = series; }
   public int getCc() { return cc; }
   public void setCc(int cc) { this.cc = cc; }
   public int getMileage() { return mileage; }
   public void setMileage(int mileage) { this.mileage = mileage; }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferari", "FN", 1500, 10); 
        /**
         * This is empty object because all instance variable don't have value      
         * Assign values when you create creating object
         */
        // car.setBrand("Ferari");
        // car.setSeries("FN");
        // car.setCc(1500);
        // car.setMileage(10);

        System.out.println(car.getBrand());
        System.out.println(car.getSeries());
        System.out.println(car.getCc());
        System.out.println(car.getMileage());
    }
}
