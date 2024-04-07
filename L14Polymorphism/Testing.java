package L14Polymorphism;

public class Testing {

    public static class Student {
        String name;
        int rollNo;
        double percent;
    }

    public static void main(String[] args) {

        Student x = new Student();
        x.name = "Aamir";
        x.rollNo = 1;
        x.percent = 98.0;
        System.out.println(x.name);
        System.out.println(x.rollNo);
        System.out.println(x.percent);

    }
}
