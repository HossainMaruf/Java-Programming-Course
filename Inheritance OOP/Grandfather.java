public class Grandfather {
   Grandfather() {
    System.out.println("Grandfather");
   }
   void GrandfatherAdviceMarry() {
    System.out.println("you will marry Katrina Kaif");
   } 
}
class Father extends Grandfather {
   Father() {
    System.out.println("Father");
   }
    void FatherAdviceMarry() {
        System.err.println("you will marry Karina");
    }
}
class Son extends Father {
   Son() {
    System.out.println("Son");
   }
    void SonWillMarry() {
        System.err.println("I want to marry Sraddha");
    }
}
class Main {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        Father f = new Father();
        Son s = new Son();
        gf.GrandfatherAdviceMarry();
        f.FatherAdviceMarry();
        s.SonWillMarry();
    }
}
