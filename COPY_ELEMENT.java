package array;

import java.util.Scanner;

public class COPY_ELEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter your element size");
		int n=sc.nextInt();
		int []a=new int [n];
		int []b=new int [n];
		for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		}
		System.out.println("element of array in a");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		//int []b=new int [n];
		System.out.println("copied element in array");
		for(int i=0;i<n;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
		
	}

}
