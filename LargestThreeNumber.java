package test1;

import java.util.Scanner;

public class LargestThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your frist number:");
		int num1=sc.nextInt();
		System.out.println("enter your second number:");
		int num2=sc.nextInt();
		System.out.println("enter your third number:");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+ " frist number is greter than"+num2+ " "+num3);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2+" second number is greater than"+num1 +" and "+num3);
		}
		else {
			System.out.println(num3+" third number is greater than"+num1 +" and "+num2);
		}

	}

}
