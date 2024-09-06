package augProgram;

import java.util.Scanner;

public class CAL_SPEED {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your distance");
		int dis=sc.nextInt();
		System.out.println("enter your time");
		double time=sc.nextDouble();
		System.out.println("speed "+(dis/time));

	}

}
