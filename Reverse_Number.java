package augProgram;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		int rem;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		int temp=n;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
			
		}
		System.out.println(rev);
		if(temp==rev)
			System.out.println("number is palindrome");
		else
			System.out.println("not palindrome");
			

	}

}
