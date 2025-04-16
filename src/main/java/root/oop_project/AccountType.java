/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.oop_project;


/**
 *
 * @author harsh
 */

public abstract class AccountType extends BankAccount {
    protected double interestRate;
    protected double transactionRate;
    protected AccountTypes accountType;

    AccountType(AccountTypes accountType){
        this.accountType=accountType;
    }
    
    public AccountTypes getAccounttype() {
        return accountType;
    }
    
    public void setaccountType(AccountTypes accountType){
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
}

