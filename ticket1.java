package testing;

import java.util.Scanner;

public class ticket1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("which course to study:");
		String skill=scan.next();
		System.out.println("which time:");
		double time=scan.nextDouble();
		if(skill.equals("java")) {
			if(time>9.00 && time<10.00) {
				System.out.println("go to ms block");
			}else {
				System.out.println("class is over");
			  }	
			}
		else if(skill.equals("python")) {
			if(time>10.00 && time<11.00) {
				System.out.println("go to cs block");
			}else {
				System.out.println("class is over");
			}
		  }
		else if(skill.equals("dotnet")) {
			if(time>12.00 && time<14.00) {
				System.out.println("go to bs block");
			}else {
				System.out.println("class is over");
			}
		}
		}

	}


