package augProgram;

import java.util.Scanner;

public class CheckSpecialCharAndDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char c = sc.next().charAt(0);
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c+" is an Alphabet");
		else if(c>='0'&&c<='9')
			System.out.println(c+" is a Number");
		else
			System.out.println(c+" is a Special Character");

	}

}
