package L3ATMProject.L9MultipleInheritance;

class A {
    public void methodA() {
        System.out.println("Method A");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("Method B");
    }
}

class C extends B {
    public void methodC() {
        System.out.println("Method C");
    }

    public void methodD() {
        System.out.println("Method D");
    }
}

public class Multiple {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodD();
        obj.methodC();
        obj.methodB();
        obj.methodA();
    }
}
