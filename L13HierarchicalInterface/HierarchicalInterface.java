package L13HierarchicalInterface;
class A{
    public void print(){
        System.out.println("Class A method");
    }
}
class B extends A{
    public void printB(){
        System.out.println("Class B method");
    }
}
class C extends A{
    public void printC(){
        System.out.println("Class C method");
    }
}
public class HierarchicalInterface {
    public static void main(String[] args) {
        // A a = new A();
        // a.print();
        B b = new B();
        b.print();
        C c = new C();
        c.print();
        System.out.println();
    }
}
