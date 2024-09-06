package augProgram;

import java.util.Scanner;

public class SideTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of a triangle : ");
		int s1=sc.nextInt();	
		int s2=sc.nextInt();		
		int s3=sc.nextInt();
		if((s1+s2)>s3 && (s2+s3)>s1 && (s3+s1)>s2)
			System.out.println("The Triangle is Valid");
		else
			System.out.println("The Triangle is Invalid");

	}

}
