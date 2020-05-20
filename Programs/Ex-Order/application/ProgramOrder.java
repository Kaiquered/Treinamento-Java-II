package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.emums.OrderStatus;

//Programa que regista uma lista de pedidos e calcula seu total.

public class ProgramOrder {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");

		System.out.printf("Name: ");
		String name = input.nextLine();
		System.out.printf("Email: ");
		String email = input.nextLine();
		System.out.printf("Birth date (DD/MM/YYYY): ");
		String birthDateU = input.next();

		Date birthDate = format.parse(birthDateU);

		System.out.println("Enter order data:");
		System.out.printf("Status: ");
		String statusU = input.next();
		System.out.printf("How many itens to this order? ");
		int n = input.nextInt();

		Order order = new Order(new Date(), OrderStatus.valueOf(statusU), new Client(name, email, birthDate));

		for (int i = 1; i <= n; i++) {
			System.out.printf("Enter #%d item data:\n", i);
			System.out.print("Product name: ");
			String productName = input.next();
			System.out.print("Product price: ");
			double productPrice = input.nextDouble();
			System.out.print("Quantity: ");
			int quantity = input.nextInt();

			order.addOderItems(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));

		}

		System.out.println("\nORDER SUMMARY:\n");
		System.out.printf("Order moment: " + order.getMoment());
		System.out.printf("\nOrder Status: " + order.getStatus());
		System.out.printf("\n%s\n", order.getClient());
		System.out.println("\nOrder items:");
		System.out.println(order.toString());
		System.out.printf(" Total price: $ %.2f", order.total());

		input.close();
	}
}
