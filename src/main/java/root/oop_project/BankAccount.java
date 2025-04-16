/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.oop_project;

/**
 *
 * @author harsh
 */
public class BankAccount extends User{
    private int accountNumber;
    private AccountStatus accountStatus;
    protected double balance;
    private User owner;
    
    private void deposit(double amount){
        balance=balance+amount;
    }
    
    private void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient funds");
            return;
        }
        balance=balance-amount;
    }
    
    private void setBalance(double balance){
        this.balance=balance;
    }
    
    private double getBalance(){
        return balance;
    }
    
    private void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    
    private double getAccountNumber(){
        return accountNumber;
    }
    
    private void setaccountStatus(AccountStatus accountStatus){
        this.accountStatus=accountStatus;
    }
    
    private AccountStatus getaccountStatus(){
        return accountStatus;
    }
    
    private void setOwner(User owner){
        this.owner=owner;
    }
    
    private User getOwner(){
        return owner;
    }
    
    @Override 
    public String toString() {
        return ("Account Number: "+accountNumber+" Account Status: "+accountStatus+" Balance: "+balance+" Owner: "+owner);
    }
}
