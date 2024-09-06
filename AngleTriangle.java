package augProgram;

import java.util.Scanner;

public class AngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your angle of triangle ");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		if(a1+a2+a3==180)
			System.out.println("triangle is valide");
		else
			System.out.println("invalide triangle");
		

	}

}
