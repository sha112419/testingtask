package testing;

import java.util.Scanner;
import java.time.zone.*;

public class ts {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("what skill required");
		String skill =obj.next();
		System.out.println("time");
		double time=obj.nextDouble();
		if(skill.equals("java")) {
			if(time>10.30 && time<12.30) {
				System.out.println("go to ms block");
			}else {
				System.out.println("class is over");
			}
		}
		else if(skill.equals("python")) {
			if(time>12.30 && time<14.30) {
				System.out.println("go to cs block");
			}else {
				System.out.println("class is overed");
			}
		}
	}

}
