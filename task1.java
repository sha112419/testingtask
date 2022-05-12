package testing;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wait= new Scanner(System.in);
		System.out.println("AGE");
		int a =wait.nextInt();
		String b= wait.next();
		if(a>5) {
			if(b.equals("indian")) {
			 	System.out.println("you are eligible for aadhar");
			}
			else {
				System.out.println("you are not eligible for aadhar");
			}
		}

	}

}
