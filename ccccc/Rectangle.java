package ccccc;

import aaaaa.Shape;

public class Rectangle extends Shape {
   public Rectangle() {
      System.out.println("Rectangle inside package");
   }
}

class Sphere extends Rectangle {
   public Sphere() {
      super.display();
   }
}
