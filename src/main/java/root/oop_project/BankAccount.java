/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.oop_project;

/**
 *
 * @author harsh
 */
public abstract class BankAccount extends User{
    protected int accountNumber;
    protected double balance;
    protected User owner;

    public BankAccount(String name, String email, int id) {
        super(name, email, id);
    }
    
    protected void deposit(double amount){
        balance=balance+amount;
    }
    
    protected void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient funds");
            return;
        }
        balance=balance-amount;
    }
    
    protected void setBalance(double balance){
        this.balance=balance;
    }
    
    protected double getBalance(){
        return balance;
    }
    
    protected void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    
    protected double getAccountNumber(){
        return accountNumber;
    }
   
    
    protected void setOwner(User owner){
        this.owner=owner;
    }
    
    public User getOwner(){
        return owner;
    }
    
    
}
