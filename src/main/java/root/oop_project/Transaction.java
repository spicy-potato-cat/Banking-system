/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.oop_project;

/**
 *
 * @author harsh
 */
public class Transaction {
    private Account fromAccount;

    public Transaction(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public boolean transferFunds(double transferAmount, Account toAccount) {
        if (transferAmount > fromAccount.balance) {
            System.out.println("Insufficient Funds");
            return false;
        }

        if ((transferAmount > 200000) && (fromAccount.getAccountType() == AccountTypes.Current)) {
            fromAccount.transactionRate = 50;
        } else if ((transferAmount > 200000) && (fromAccount.getAccountType() == AccountTypes.Savings)) {
            fromAccount.transactionRate = 10;
        }

        fromAccount.balance -= transferAmount;
        toAccount.balance += transferAmount - fromAccount.transactionRate;
        return true;
    }
}
