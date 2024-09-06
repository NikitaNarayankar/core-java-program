package array;

import java.util.*;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		//taking input from user
		System.out.print("enter element");
		for(int i=0;i<arr.length;i++) {
			//System.out.print("enter element");
			arr[i]=sc.nextInt();
		}
		//print the element
		System.out.println("elements are array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		//find out small element are present in array
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println( );
		System.out.println("smallest number is" +min);

	}

}
