package testWork1;

import java.util.Scanner;

public class Product {
	
	public int id;
	public String name;
	public int price;
	
	public void readData()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Id");
		id = Integer.parseInt(obj.nextLine());
		System.out.println("Enter Name");
		name=obj.nextLine();
		System.out.println("Enter Price");
	 	price= Integer.parseInt(obj.nextLine());
		obj.close();
		
	}
	
	public void printData()
	{
		System.out.println("Id : "+id);
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
	}

}
