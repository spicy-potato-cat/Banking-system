/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.oop_project;

/**
 *
 * @author harsh
 */

public class AccountStatus extends BankAccount {
    private AccountStatusType status;
    
    public void setAccountStatus(AccountStatusType status){
        try{
            this.status=status;
        } catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
    public AccountStatusType getAccountStatus(){
        return status;
    }
}

