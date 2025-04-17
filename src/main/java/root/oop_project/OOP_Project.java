/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package root.oop_project;

/**
 *
 * @author dhruv
 */
public class OOP_Project {

    public static void main(String[] args) {
        // Create two accounts
        User alice=new User("Alice","abc@email.com",1);
        User bob=new User("Bob","xyz@email.com",2);
        
        Account account1=new Account(alice,AccountTypes.Current);
        Account account3=new Account(bob, AccountTypes.Savings);
        Account account2=new Account(bob,AccountTypes.Savings);
      
        System.out.println("Initial Balances:");
        account1.getBalance();
        account2.getBalance();

        System.out.println("\n--- Depositing 50000 in Account 1---");
        account1.deposit(50000);
        
        
        System.out.println("\n--- Transferring 100000 from Alice to Bob ---");
        Transaction transaction1 = new Transaction(account1);
        boolean success = transaction1.transferFunds(100000,account2);
        System.out.println("Transfer " + (success ? "successful." : "failed."));
        
        System.out.println("\n--- Transferring 50000 from Alice to Bob ---");
        Transaction transaction2 = new Transaction(account1);
        success = transaction2.transferFunds(50000, account2);  
        System.out.println("Transfer " + (success ? "successful." : "failed."));


        
        System.out.println("\nBalances After Transfer:");
        account1.getBalance();
        account2.getBalance();

        System.out.println("\n--- Freezing Bob's Account ---");
        account2.setAccountStatus(AccountStatusType.FROZEN);
        
       
    }
}
