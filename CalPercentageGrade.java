package augProgram;

import java.util.Scanner;

public class CalPercentageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your subject marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int total=500;
		double percentage;
		int obtainMark=m1+m2+m3+m4+m5;
		System.out.println("enter obtain marks"+obtainMark);
		percentage=(obtainMark/500)*100;
		if(percentage>=90.0)
			System.out.println("Grade A");
		else if(percentage >= 80.0)
			System.out.println("Grade B");
		else if(percentage >= 70.0)
			System.out.println("Grade C");
		else if(percentage >= 60.0)
			System.out.println("Grade D");
		else if(percentage >= 40.0)
			System.out.println("Grade E");
		else if(percentage < 40.0)
			System.out.println("Grade F");
		else 
			System.out.println("Fail");
		
		

	}

}
