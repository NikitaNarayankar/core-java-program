package augProgram;

import java.util.Scanner;

public class SWAPPING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter frist variable value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swapping " +a +" "+b);
		//b=a;
		a=a+b-a;
		b=a-b;
		
		System.out.println("after swapping " +a+" " +b);
		
		

	}

}
