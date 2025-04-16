/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.oop_project;

/**
 *
 * @author harsh
 */
public class Transferable extends AccountType{
    
    public Transferable(AccountTypes accountType) {
        super(accountType);
    }
    
    public void transferFunds(double transferAmount,BankAccount toAccount){
        if(transferAmount>balance){
            System.out.println("Insufficient Funds");
            return;
        }
        if((transferAmount>200000) && (this.accountType==AccountTypes.Current)){
            this.transactionRate=50;            
        } else if((transferAmount>200000) && (this.accountType==AccountTypes.Savings)){
            this.transactionRate=10;
        }
        this.balance-=transferAmount;
        toAccount.balance+=transferAmount-transactionRate;
    }
}
