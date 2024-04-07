package L3ATMProject;

// import java.util.*;

// class ATM {
//     float Balance;
//     int PIN = 5674;

//     public void checkPin() {
//         System.out.println("Enter your pin: ");
//         Scanner sc = new Scanner(System.in);
//         sc.close();
//         int enteredPin = sc.nextInt();
//         if (enteredPin == PIN) {
//             menu();
//         } else {
//             System.out.println("Wrong Pin! Try Again.");
//         }
//     }

//     public void menu() {
//         System.out.println("Enter your choice: ");
//         System.out.println("1. Check A/C Balance: ");
//         System.out.println("2. Withdraw Money: ");
//         System.out.println("3. Deposit Money: ");
//         System.out.println("4. EXIT: ");

//         Scanner sc = new Scanner(System.in);
//         sc.close();
//         int choice = sc.nextInt();
//         if (choice == 1) {
//             checkBalance();
//         } else if (choice == 2) {
//             withdrawMoney();
//         } else if (choice == 3) {
//             depositMoney();
//         } else if (choice == 4) {
//             return;
//         } else {
//             System.out.println("Invalid Choice!");
            
//         }
//     }

//     public void checkBalance() {
//         System.out.println("Checking Balance: " + Balance);
//         menu();
//     }

//     public void withdrawMoney() {
//         System.out.println("Enter Amount to withdraw: ");
//         Scanner sc = new Scanner(System.in);
//         float amount = sc.nextFloat();
//         if (amount > Balance) {
//             System.out.println("Insufficient Balance!");
//         } else {
//             Balance -= amount;
//             System.out.println("Withdrawal Successful!");
//             sc.close();
//         }
//         menu();
//     }

//     public void depositMoney() {
//         System.out.println("Deposit the Amount: ");
//         Scanner sc = new Scanner(System.in);
//         float amount = sc.nextFloat();
//         Balance += amount;
//         System.out.println("Deposit Successful!");
//         menu();
//         sc.close();
//     }
// }

// public class ATM_Machine {
//     public static void main(String[] args) {
//         ATM atm = new ATM();
//         atm.checkPin();
//     }
// }






import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5674;
    Scanner sc;

    public void checkPin() {
        System.out.println("Enter your pin: ");
        sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Wrong Pin! Try Again.");
        }
    }

    public void menu() {
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance: ");
        System.out.println("2. Withdraw Money: ");
        System.out.println("3. Deposit Money: ");
        System.out.println("4. EXIT: ");

        int choice = sc.nextInt();
        if (choice == 1) {
            checkBalance();
        } else if (choice == 2) {
            withdrawMoney();
        } else if (choice == 3) {
            depositMoney();
        } else if (choice == 4) {
            sc.close();
            return;
        } else {
            System.out.println("Invalid Choice!");
        }
    }

    public void checkBalance() {
        System.out.println("Checking Balance: " + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to withdraw: ");
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance!");
        } else {
            Balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Deposit the Amount: ");
        float amount = sc.nextFloat();
        Balance += amount;
        System.out.println("Deposit Successful!");
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}
