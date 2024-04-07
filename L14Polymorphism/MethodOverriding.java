package L14Polymorphism;

class Bank{
    public void RateOfInterest(){
        System.out.println("Generally Rate of interest is 5%");
    }
}
class SBI extends Bank{
    public void RateOfInterest(){
        System.out.println("SBI Rate of interest is 6.5%");
    }
}
class PNB extends Bank{
    public void RateOfInterest(){
        System.out.println("PNB Rate of interest is 6%");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.RateOfInterest();
        SBI sbi = new SBI();
        sbi.RateOfInterest();
        PNB obj2 = new PNB();
        obj2.RateOfInterest();
    }
}
