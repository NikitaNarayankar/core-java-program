package augProgram;

import java.util.Scanner;

public class EqilatorALiSOsceles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the sides of a triangle : ");
		int a1=sc.nextInt();	
		int a2=sc.nextInt();		
		int a3=sc.nextInt();
		if(a1==a2&&a2==a3)
			System.out.println("The Triangle is Equilateral");
		else if(a1==a2||a2==a3||a1==a3)
			System.out.println("The Triangle is Isosceles");
		else
			System.out.println("The Triangle is Scalene");

	}

}
