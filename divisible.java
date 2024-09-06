package augProgram;

import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		if(num%5==0 && num%11==0)
			System.out.println("number is divisible by 5 and 11");
		else
			System.out.println("number is not divisible by 11 and 5");

	}

}
