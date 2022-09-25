package com.address.bridgelabz;
import java.util.Scanner;

public class AddContact {
	static void details() {
		Scanner sc = new Scanner(System.in);
		
		Contacts contact = new Contacts();
		
		System.out.println("Enter your name - ");
		contact.setFullNames(sc.next());
		sc.nextLine();
		System.out.println("Enter your Address - ");
		contact.setAddress(sc.next());
		sc.nextLine();
		System.out.println("Enter your city - ");
		contact.setCity(sc.next());
		
		System.out.println("Enter your state - ");
		contact.setState(sc.next());
		
		System.out.println("Enter your zip - ");
		contact.setZip(sc.next());
		
		System.out.println("Enter your Phone Number - ");
		contact.setPhoneNumber(sc.next());
		
		System.out.println("\n ---Student all details--- \n");
		
		System.out.println("Student name is " + contact.getFullNames());
		System.out.println("Student Address is " + contact.getAddress());
		System.out.println("Student city is " + contact.getCity());
		System.out.println("Student state is " + contact.getState());
		System.out.println("Student zip is " + contact.getZip());
		System.out.println("Student Phone Number is " + contact.getPhoneNumber());

	}
}