package augProgram;

import java.util.Scanner;

public class CONVERTFAHTODEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your fareignt temp");
		int far=sc.nextInt();
		
		int deg=((far-32)*5)/100;
		System.out.println("conversion of fahennhrit temp to degree" +deg);

	}

}
