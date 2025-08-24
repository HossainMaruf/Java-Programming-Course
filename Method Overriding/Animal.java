public class Animal {
   Animal() {
    System.out.println("From Animal");
   } 
}
class Dog extends Animal {
   Dog() {
    System.out.println("From Dog");
   } 

}
class Cat extends Animal {
   Cat() {
    System.out.println("From Cat");
   } 
}

class Main {
    public static void main(String[] args) {
       Animal a = new Animal(); 
       Dog d = new Dog();
       Cat c = new Cat();
       Animal aa = new Dog();
       Animal aaa = new Cat();
      //  Dog dd = new Animal(); // ERROR
      // Cat cc = new Animal(); // ERROR
    }
}
