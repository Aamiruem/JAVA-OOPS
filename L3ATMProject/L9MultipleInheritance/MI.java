package L3ATMProject.L9MultipleInheritance;

interface A {
    public void run();
}

interface B {
    public void run();
}

class C implements A,B {
    public void run() {
        System.out.println("Inside C class run method");
    }
}
// MI => Multiple Inheritance
public class MI {
    public static void main(String[] args) {
        C obj = new C();
        obj.run();
    }
}
