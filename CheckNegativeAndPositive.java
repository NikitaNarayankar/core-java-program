package augProgram;

import java.util.Scanner;

public class CheckNegativeAndPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		double num=sc.nextDouble();
		if(num>0)
			System.out.println("positive number");
		else if(num==0)
			System.out.println("zero number");
		else
			System.out.println("negative number");

	}

}
