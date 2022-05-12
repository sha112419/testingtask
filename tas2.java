package testing;

import java.util.Scanner;

public class tas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bus = new Scanner(System.in);
		System.out.println("which place");
		String place = bus.next();
		System.out.println("comfort");
		String comfort = bus.next();
		System.out.println("amount");
		int amount = bus.nextInt();
		if (place.equals("chennai")) {
			if (comfort.equals("ordinary")) {			
				if (amount > 250) {
				System.out.println("yes seat is available");
				} else {
					System.out.println("no seat is not available");
			   }
		     }	
		
			else if(comfort.equalsIgnoreCase("ultradeluxe")) {
				if(amount>350){
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
			}
			else if(comfort.equals("sleeper")) {
				if(amount>500) {
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
		}else 
			 {
				System.out.println("no it is not available");
		}
	  }
		if(place.equals("coimbatore")) {
			if (comfort.equals("ordinary")) {			
				if (amount > 150) {
				System.out.println("yes seat is available");
				} else {
					System.out.println("no seat is not available");
			   }
		     }
			else if(comfort.equalsIgnoreCase("ultradeluxe")) {
				if(amount>250){
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
			}
			else if(comfort.equals("sleeper")) {
				if(amount>400) {
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
		}else 
			 {
				System.out.println("no it is not available");
		   }
		}
    }
}



