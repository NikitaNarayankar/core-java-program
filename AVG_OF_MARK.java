package augProgram;

import java.util.Scanner;

public class AVG_OF_MARK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your five sub marks");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		int avg=sum/2;
		System.out.println("tottal marks" +sum);
		System.out.println("avg mark"+avg);
		

	}

}
