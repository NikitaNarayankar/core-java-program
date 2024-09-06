package augProgram;

import java.util.Scanner;

public class SUM_OF_RANGE_NUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your value n");
		int n=sc.nextInt();
		while(n>0) {
			sum=sum+n;
			n--;
		}
		System.out.println(sum);

	}

}
