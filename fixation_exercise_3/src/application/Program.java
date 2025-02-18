package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount;
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accHolder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			bankAccount = new BankAccount(accNumber, accHolder, initialDepositValue);
		} else {
			bankAccount = new BankAccount(accNumber, accHolder);
		}
		
		
		System.out.println("Account data: " + bankAccount);
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bankAccount.deposit(depositValue);
		System.out.println("Updated Account data: " + bankAccount);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bankAccount.withdraw(withdrawValue);
		System.out.println("Updated Account data: " + bankAccount);
		
		
		sc.close();

	}

}
