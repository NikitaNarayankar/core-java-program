package augProgram;

import java.util.Scanner;


public class CheckAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your character");
		char c=sc.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
			System.out.println(c+" is an Alphabet");
		else
			System.out.println(c+" is Not an Alphabet");
		



	}

}
