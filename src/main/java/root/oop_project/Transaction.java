/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.oop_project;

/**
 *
 * @author harsh
 */
public class Transaction extends Account{

    public Transaction(Account account) {
        super(account.owner, account.accountType); 
        this.accountNumber = account.accountNumber;
        this.balance = account.balance;
        this.interestRate = account.interestRate;
        this.transactionRate = account.transactionRate;
    }
 
        
    public boolean transferFunds(double transferAmount,BankAccount toAccount){
        if(transferAmount>balance){
            System.out.println("Insufficient Funds");
            return false;
        }
        if((transferAmount>200000) && (this.accountType==AccountTypes.Current)){
            this.transactionRate=50;            
        } else if((transferAmount>200000) && (this.accountType==AccountTypes.Savings)){
            this.transactionRate=10;
        }
        this.balance-=transferAmount;
        toAccount.balance+=transferAmount-transactionRate;
        return true;
    }
}
