// package L12SuperKeyWord;
// //To invoke parent class constructors
// class Animal{
//     Animal(){
//         System.out.println("Animal Constructor is created");
//     }
// }

// class Dog extends Animal{
//     Dog(){
//         super();
//         System.out.println("Dog Constructor is created");
//     }
// }
// public class Constructors {
//     public static void main(String[] args) {
//         Dog d = new Dog();
        
//     }
// }






// package L12SuperKeyWord;

// // To invoke parent class constructors
// class Animal {
//     Animal() {
//         System.out.println("Animal Constructor is created");
//     }
// }

// class Dog extends Animal {
//     Dog() {
//         super();
//         System.out.println("Dog Constructor is created");
//     }
// }

// public class Constructors {
//     public static void main(String[] args) {
//         Dog d = new Dog();

//     }
// }





package L12SuperKeyWord;

public class Constructors {
    int modelYear;
    String modelName;

    public Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructors myCar = new Constructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
