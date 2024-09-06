package augProgram;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your b and e value");
		int b=sc.nextInt();
		int e=sc.nextInt();
		int res=1;
		while(e>0) {
			res=res*b;
			
			e--;
		}
		System.out.println("the power of" +res);

	}

}
