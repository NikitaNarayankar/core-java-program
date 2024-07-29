package test1;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				flag++;
			}
		}
		if(flag==2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}

	}

}
