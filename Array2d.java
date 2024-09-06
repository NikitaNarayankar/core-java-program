package array;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and colume");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]a=new int[r][c];
		System.out.println("enter matrix element");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("element of matrix");
		int sum=0;
		int sum1=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+"\t");
				if(a[i]==a[j]) {
					sum=sum+a[i][j];
					
				}
				else {
					sum1=sum1+a[i][j];
				}
				
			}
			System.out.println();
			
			
		}
		System.out.println("sum of diagonal element"+sum);
		System.out.println("sum of diagonal element"+sum1);
	}

}
