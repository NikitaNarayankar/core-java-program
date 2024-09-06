
package augProgram;

import java.util.Scanner;

public class simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your amount");
		int p=sc.nextInt();
		System.out.println("enter the rate of interest");
		double r=sc.nextDouble();
		System.out.println("enter the number of time");
		double t=sc.nextDouble();
		double si=(p*r*t)/100;
		System.out.println("simple interest is "+si);
		

	}

}
