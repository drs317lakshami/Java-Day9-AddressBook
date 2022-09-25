package com.address.bridgelabz;
import java.util.*;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("###### Welcome To Address Book Program #####");
		
		AddressBookMain.switchCase();
		
	}
		static void switchCase() {
			Scanner s = new Scanner(System.in);
			int choice = 0;
			
			do {
				System.out.println("1.Add Contact\n" + "2.Exit Mode\n");
				System.out.println("Enter choice - ");
				choice = s.nextInt();
				
			switch(choice) {
			case 1:
				AddContact.details();
				break;
				
			case 2:
				System.out.println("Exit !!!!");
				break;
				
			default:
				System.out.println("invalid input");
			}
				
			}while(choice != 2);
			
		}
}