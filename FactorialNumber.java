package augProgram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a java program to find out factorial
		
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your number");
       int num=sc.nextInt();
       
       int fact=1;
       for(int i=num;num>0;i--) {
    	   fact=fact*i;
    	   
    	   
    	   
       }
       System.out.println("factorial " +fact);
	}

}
