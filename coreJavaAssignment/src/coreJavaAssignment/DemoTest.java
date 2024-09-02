package coreJavaAssignment;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int choice;
		String con;
		int pid;
		String pname;
		float price;
	
		do {
			System.out.println("1:Add Product 2 :View all products");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter the product id");
			    pid = sc.nextInt();
			    System.out.println("Enter the product name");
				pname = sc.next();
				System.out.println("Enter ther product price");
				price = sc.nextFloat();
				Product p = new Product(pid, pname, price);
				FileInputStream fis = new FileInputStream("product.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				Product prod1 = (Product)obj;
				System.out.println(prod1);
				break;
			case 2 : 
				FileInputStream fis1 = new FileInputStream("products.ser");
				ObjectInputStream ois1 = new ObjectInputStream(fis1);
				Object obj1 = ois1.readObject();
				List<Product> products = (List<Product>)obj1;
				List<Product> listOfProduct = products;
			         for(Product product :listOfProduct) {
			        	 System.out.println(product);   // toString method 
			         }
			         break;
			
			          
			
			default:System.out.println("wrong choice");
				break;
			}
			System.out.println("do you want to continue(y/n)");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank you!");
		
		
		
		FileInputStream fis = new FileInputStream("product.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Product prod1 = (Product)obj;		// down level type casting 
		System.out.println(prod1);

	}

}
