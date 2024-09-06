package augProgram;

import java.util.Scanner;

public class fiboncisSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		int frist=0;
		int second=1;
		System.out.println("foboncis Series");
		System.out.print(frist + " ");
		System.out.print(second+ " ");
		int tem=frist+second;
		for(int i=1;i<=num;i++) {
			System.out.print(tem+ " ");
			frist=second;
			
			second=tem;
			tem=frist+second;
			//System.out.print(tem);
			
		
			
			
			
			
		}

	}

}
