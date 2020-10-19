package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name,price,quantity);
		
		System.out.println(product);
		
		System.out.printf("Product data: " + product);
		
		System.out.println("");
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println("");
		
		System.out.printf("Updated data: " + product);
		
		System.out.println("");
		
		System.out.print("Enter the number of products to be removed in stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println("");
		
		product.setName("Computer");
		
		System.out.printf("Updated data: " + product);
			
		sc.close();
	}

}
