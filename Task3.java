import java.util.Scanner;

 class BankAccount {
    private static double balance = 0;
    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }
    
    public double Balance() {
        return balance;
    }
}
 
public class Task3 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


       for(;;)
        {
        System.out.println("Welcome to the ATM!");
        System.out.println("Type 1 to Withdraw");
        System.out.println("Type 2 to  Deposit");
        System.out.println("Type 3 to  Check Balance");
        System.out.println("Type 4 to Exit");
        int option = scan.nextInt();
        if(option==1)
        {
            System.out.println("How much would you like to withdraq ?");
              double withdraw = scan.nextDouble();
            BankAccount bAccount =new BankAccount();
             bAccount.withdraw(withdraw);
        }

        else if(option==2){
            System.out.println("How much would you like to deposit ?");
              double deposit = scan.nextDouble();
            BankAccount bAccount =new BankAccount();
            bAccount.deposit(deposit);
        }
        else if(option==3){
         BankAccount bAccount =new BankAccount();
           bAccount.Balance();
         System.out.println("Balance =" + bAccount.Balance());
        }else if(option==4){
            BankAccount bAccount =new BankAccount();
            System.out.println(" Remaining Balance :" + bAccount.Balance() );
            System.out.println("Thank you! ");
            break;
        }
        else {
            System.out.println("Invalid Input");
        }
    }
           scan.close();
                
}
     
    }


