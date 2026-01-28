package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
   public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      Account account;
      int totalAccounts = 0;
      Account[] vect = new Account[20];

      char option;
      do {
         System.out.println("Welcome to our Bank ");
         System.out.println("What do you want to do?");
         System.out.println("\n--- MENU ---");
         System.out.println("n: New account");
         System.out.println("d: Deposit");
         System.out.println("w: Withdraw");
         System.out.println("s: Show Data");
         System.out.println("t: Transfer");
         System.out.println("e: Exit");
         System.out.println("x: Statement");
         System.out.print("Choose an option: ");
         option = sc.next().charAt(0);
         switch (option) {
            case 'n':
               if (totalAccounts < vect.length) {

                  System.out.print("Enter account holder: ");
                  sc.nextLine();
                  String holder = sc.nextLine();

                  System.out.print("Enter new password:");
                  int password = sc.nextInt();

                  System.out.print("Is there an initial deposit (y/n)? ");
                  char response = sc.next().charAt(0);

                  if (response == 'y') {
                     System.out.print("Enter initial deposit value: ");
                     sc.nextLine();
                     double initialDeposit = sc.nextDouble();

                     totalAccounts++;
                     vect[totalAccounts] = new Account(holder, initialDeposit, password);
                  } else {
                     vect[totalAccounts] = new Account(holder, password);
                  }

                  System.out.println("Your Account Number is: " + vect[totalAccounts].getNumber());

               } else {
                  System.out.println("Error: Bank is full!");
               }
               break;

            case 'd':
               System.out.print("Enter account number to operate: ");
               int searchId = sc.nextInt();

               Account selectedAccount = null;
               for (int i = 0; i < vect.length; i++) {
                  if (vect[i] != null && vect[i].getNumber() == searchId) {
                     selectedAccount = vect[i];
                     break;
                  }
               }
               if (selectedAccount != null) {
                  System.out.print("Enter deposit value: ");
                  double depValue = sc.nextDouble();
                  selectedAccount.deposit(depValue);
               } else {
                  System.out.println("Error: Account not found!");
               }
               break;
            case 'w':
               System.out.print("Enter account number to operate: ");
               int searchIdWithdraw = sc.nextInt();

               Account accWithdraw = findAccount(vect, searchIdWithdraw);

               if (accWithdraw != null) {
                  System.out.print("Enter withdraw value: ");
                  double val = sc.nextDouble();

                  System.out.print("Enter your password: ");
                  int pwd = sc.nextInt();

                  accWithdraw.withdraw(val, pwd);

               } else {
                  System.out.println("Error: Account not found!");
               }
               break;

            case 's':
               System.out.print("Enter account number to show: ");
               int searchIdShow = sc.nextInt();
               Account accShow = null;
               for (int i = 0; i < vect.length; i++) {
                  if (vect[i] != null && vect[i].getNumber() == searchIdShow) {
                     accShow = vect[i];
                     break;
                  }
               }
               if (accShow != null) {
                  System.out.println(accShow);
               } else {
                  System.out.println("Error: Account not found!");
               }
               break;

            case 't':
               System.out.print("Enter sender account number: ");
               int idSender = sc.nextInt();
               Account accSender = findAccount(vect, idSender); // Olha que limpeza! 1 linha resolve.

               if (accSender != null) {
                  System.out.print("Enter receiver account number: ");
                  int idReceiver = sc.nextInt();
                  Account accReceiver = findAccount(vect, idReceiver); // Reusamos a lógica!

                  if (accReceiver != null) {
                     System.out.print("Enter transfer value: ");
                     double amount = sc.nextDouble();

                     System.out.print("Enter your password: ");
                     int pwd = sc.nextInt();
                     accSender.transfer(amount, accReceiver, pwd);

                  } else {
                     System.out.println("Error: Receiver account not found!");
                  }
               } else {
                  System.out.println("Error: Sender account not found!");
               }
               break;
            case 'e':
               System.out.println("Goodbye!");
               break;
            case 'x':
               System.out.print("Enter account number: ");
               int searchIdStatement = sc.nextInt();
               Account accStatement = findAccount(vect, searchIdStatement);

               if (accStatement != null) {
                  System.out.print("Enter your password: ");
                  int pwd = sc.nextInt();
                  accStatement.printStatement(pwd);
               } else {
                  System.out.println("Error: Account not found!");
               }
               break;

            default:
               System.out.println("Invalid option!");
         }
      } while (option != 'e');
   }

   public static Account findAccount(Account[] vect, int id) {
      for (int i = 0; i < vect.length; i++) {
         if (vect[i] != null && vect[i].getNumber() == id) {
            return vect[i];
         }
      }
      return null;
   }
}
