package application;

import java.util.Scanner;

import entities.Account1;

// Programa Conta bancária com as opções de depósito inicial, depósito e saque com uma taxa de $ 5.00.


public class ProgramAccount1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Account1 Account;

		System.out.print("Enter account number: ");
		int number = input.nextInt();

		input.nextLine();

		System.out.print("Enter account holder: ");
		String name = input.nextLine();

		System.out.print("Is there na initial deposit? (y/n) ");
		char op = input.next().charAt(0);

		if (op == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double initial_deposit = input.nextDouble();
			Account = new Account1(number, name, initial_deposit);
			
		} else if (op == 'n')
			
			Account = new Account1(number, name);
		
		else {
			
			System.out.print("Value Invalid!");
			Account = new Account1();
			System.exit(0);
		}

		System.out.println("\n" + "Account data:");
		
		System.out.print(Account + "\n");

		System.out.print("Enter a deposit value: ");
		double value_deposit = input.nextDouble();
		Account.deposit(value_deposit);

		System.out.println("\n" + "Updated account data:");
		
		System.out.print(Account + "\n");
		
		System.out.print("Enter a withdraw value: ");
		double value_withdraw = input.nextDouble();
		Account.withdraw(value_withdraw);
		
		System.out.println("\n" + "Updated account data:");

		System.out.print(Account);

		input.close();
	}

}
