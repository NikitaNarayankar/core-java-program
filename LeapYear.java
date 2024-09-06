package augProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your year");
		int a=sc.nextInt();
       if(a%4==0 &&a%100!=0 || a%400==0) {
			
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}

	}

}
