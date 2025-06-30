package StaticAndDefaultHiding;

public class StaticHiding {
    static void m1() {
        System.out.println("Parent class m1 method is calling");
    }
}

class C extends StaticHiding {
    static void m1() {
        System.out.println("Child class m1 method is calling");
    }
}

class D {
    public static void main(String args[]) {
        StaticHiding s = new C();  // Reference of Parent, object of Child
        s.m1();  // Calls Parent's static method due to static hiding
    }
}
