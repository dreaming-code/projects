/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*; 
public class Atm { 

	// Display current balance in account 
	public static void displayBalance(int balance) 
	{ 
		System.out.println("Current Balance : " + balance); 
		System.out.println(); 
	} 

	// Withdraw amount and update the balance 
	public static int amountWithdrawing(int balance, int withdrawAmount) 
	{ 
		System.out.println("Withdrawn Operation:"); 
		System.out.println("Withdrawing Amount : "
						+ withdrawAmount); 
		if (balance >= withdrawAmount) { 
			balance = balance - withdrawAmount; 
			System.out.println( 
				"Please collect your money and collect the card"); 
			displayBalance(balance); 
		} 
		else { 
			System.out.println("Sorry! Insufficient Funds"); 
			System.out.println(); 
		} 
		return balance; 
	} 

	// Deposit amount and update the balance 
	public static int amountDepositing(int balance, int depositAmount) 
	{ 
		System.out.println("Deposit Operation:"); 
		System.out.println("Depositing Amount : "
						+ depositAmount); 
		balance = balance + depositAmount; 
		System.out.println( 
			"Your Money has been successfully deposited"); 
		displayBalance(balance); 
		return balance; 
	} 

	public static void main(String args[]) 
	{ 
	    Scanner sc=new Scanner(System.in);
		int balance = 10000; 
        System.out.println("\t\tWELCOME TO THE ATM \nCHOOSE THE OPERATION YOU WANT TO PERFORM :");
        System.out.print("TO DEPOSIT PRESS        1\nTO WITHDRAW PRESS       2\nTO CHECK BALANCE PRESS  3\nTO EXIT PRESS           4\nEnter your choice :");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter the amount to be Deposited :");
            int s=sc.nextInt();
            amountDepositing(balance,s);
        }
        else if(ch==2)
        {
            System.out.println("Enter the amount to be Withdrawn :");
            int s=sc.nextInt();
            amountWithdrawing(balance,s);
        }
        else if(ch==3)
        {
            displayBalance(balance);
        }
        System.out.println("------THANK YOU FOR COMING!!------");
	} 
}
