// package L12SuperKeyWord;
// //To invoke parent class
// class Animal{
//     String color = "white";
// }
// class dog extends Animal{
//     String color = "brown";
//     void dogSound(){
//         System.out.println("The dog says: woof woof");
//     }
// }

// class Dog extends Animal{
//     void eat(){
//         System.out.println("eating bread .....");
//     }
//     void bark(){
//         System.out.println("barking.....");
//     }
//     void work(){
//         super.eat();
//         bark();
//         System.out.println("working.....");
//     }
// }

// class dogs extends Animal{
//     String color = "black";
//     void printColor(){
//         System.out.println(color);// print color of dogs class
//         System.out.println(super.color);// print color of animal class
//     }
// }
// public class SuperkeyWord {
//     public static void main(String[] args) {
//         dog d = new dog();
//         d.dogSound();
//         dogs d1 = new dogs();
//         d1.printColor();
//         Dog D = new Dog();
//         D.eat();
//         D.bark();
//         D.work();
//     }
// }







package L12SuperKeyWord;
//To invoke parent class
class Animal{
    void eat(){
        System.out.println("eating.....");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("eating bread .....");
    }
    void bark(){
        System.out.println("barking.....");
    }
    void work(){
        super.eat();
        bark();
    }
}




public class SuperkeyWord {
    public static void main(String[] args) {
        
        Dog D = new Dog();
        D.eat();
        D.bark();
        D.work();
    }
}
