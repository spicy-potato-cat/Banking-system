/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.oop_project;


/**
 *
 * @author harsh
 */

public class Account extends BankAccount {
    protected double interestRate;
    protected double transactionRate;
    protected AccountTypes accountType;
    private AccountStatusType status;

    public Account(User user, AccountTypes accountType,int accountNumber) {
        super(user.getName(), user.getEmail(), user.getId()); 
        this.owner = user;
        this.accountType = accountType;
        this.status = AccountStatusType.ACTIVE; 
        this.accountNumber=accountNumber;
    }

   
    
    
    public AccountTypes getAccountType() {
        return accountType;
    }
    
    public void setAccountType(AccountTypes accountType){
        this.accountType=accountType;
    }
    
    public double getInterestRate() {
        if(accountType==(AccountTypes.Current)){
            return 0;
        }
        return interestRate;
    }
    
    public void setInterestRate(double rate){
        interestRate=rate;
    }    
    
    @Override
    protected void deposit(double amount) {
        if (status == AccountStatusType.FROZEN) {
            System.out.println("Deposit failed: Account is frozen.");
            return;
        } else if (status == AccountStatusType.CLOSED) {
            System.out.println("Deposit failed: Account is closed.");
            return;
        }
        super.deposit(amount); // Call the parent class method to actually deposit
    }

    // Override withdraw to check if account is frozen or closed
    @Override
    protected void withdraw(double amount) {
        if (status == AccountStatusType.FROZEN) {
            System.out.println("Withdrawal failed: Account is frozen.");
            return;
        } else if (status == AccountStatusType.CLOSED) {
            System.out.println("Withdrawal failed: Account is closed.");
            return;
        }
        super.withdraw(amount); // Call the parent class method to actually withdraw
    }
    
    public void setAccountStatus(AccountStatusType status) {
        this.status = status;
    }
    
    public AccountStatusType getAccountStatus(){
        return status;
    }
    
    @Override
    public String toString() {
    return """
           Account Details {
             Account Number: """ + accountNumber +
           "\n  Balance: " + balance +
           "\n  Account Type: " + accountType +
           "\n  Interest Rate: " + interestRate +
           "\n  Transaction Rate: " + transactionRate +
           "\n  Status: " + status +
           "\n  Owner: " + owner +
           "\n}";
}

}

