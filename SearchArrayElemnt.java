package array;

import java.util.Scanner;

public class SearchArrayElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//searching the element is present in array
		int[] arr= {10,20,30,40,50};
	  
		Scanner input=new Scanner(System.in);
		System.out.println("enter your element:");
		int element=input.nextInt();
//		int num1=50;
//		int num2;
		boolean a=false;
		
		for(int i=0;i<arr.length;i++) {
			//int original;
//			num1=arr[i];
			
		if(element==arr[i]) 
		 {
		a=true;
		break;
//		 
		 }
			
		}
		if(a==true)
		{
			System.out.println("element is present");
		}
		else {
			System.out.println("not present");
		}
		
	
		
	}

}
