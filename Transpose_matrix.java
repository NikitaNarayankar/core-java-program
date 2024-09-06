package array;

import java.util.Scanner;

public class Transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row and colume size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]a=new int[r][c];
		int [][]b=new int[r][c];
		//Transpose of matrix
		System.out.println("enter your element of array");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("before the transpose of matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("after the transpose of matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
		

	}

}
