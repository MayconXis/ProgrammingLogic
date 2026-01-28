package entities;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private int password;
    private static final double TAX = 5.0;
    private static int sequence = 1000;;
    private List<String> statement = new ArrayList<>();

    public Account(String holder, int password) {
        this.number = ++sequence;
        this.holder = holder;
        this.password = password;
    }

    public Account(String holder, double initialDeposit, int password) {
        this.number = ++sequence;
        this.holder = holder;
        this.password = password;
        deposit(initialDeposit);

    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            statement.add("Saque: $ " + String.format("%.2f", amount) + " (Taxa: $ " + TAX + ")");
        } else {
            System.out.println("Error: The deposit amount must be positive.");
        }
    }

    public void withdraw(double amount, int pwdInput) {
        if (this.password == pwdInput) {
            if (amount + TAX <= balance) {
                balance -= amount + TAX;
                statement.add("Saque: $ " + String.format("%.2f", amount) + " (Taxa: $ " + TAX + ")");
            } else {
                System.out.println("Transaction denied: Insufficient funds (Amount + Fee exceed balance).");
            }
        } else {
            System.out.println("Incorrect password, please try again");
        }

    }

    public void transfer(double amount, Account targetAccount, int pwdInput) {
        double totalAmount = amount + TAX;
        if (this.password == pwdInput) {
            if (totalAmount <= this.balance) {
                this.balance -= totalAmount;

                targetAccount.deposit(amount);
                this.statement.add("Transferência enviada para conta " + targetAccount.getNumber() + ": $ "
                        + String.format("%.2f", amount));

                System.out.println("Transfer successful!");
            } else {
                System.out.println("Transaction denied: Insufficient funds.");
            }
        } else {
            System.out.print("Incorrect password, please try again");
        }
    }

    public void setPwd(int password) {
        this.password = password;
    }

    public void printStatement(int pwdInput) {
        if (this.password == pwdInput) {
            System.out.println("\n=== EXTRATO DA CONTA " + this.number + " ===");
            System.out.println("--- Account Statement" + this.number + " ---");
            if (statement.isEmpty()) {
                System.out.println("No transactions were made on the account.");
            } else {
                for (String transaction : statement) {
                    System.out.println(transaction);
                }
            }
            System.out.println("Saldo Atual: $ " + String.format("%.2f", balance));
            System.out.println("-----------------------------");
        } else {
            System.out.println("Senha incorreta. Acesso ao extrato negado.");
        }
    }

    public String toString() {
        return "Account: "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
