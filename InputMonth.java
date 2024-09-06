package augProgram;

import java.util.Scanner;

public class InputMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your months below");
		System.out.println("1.jan 2.feb 3.mar 4.apri 5.may 6.jun 7.jul 8.aug 9.sep 10.oct 11.nov 12.dec");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
		case 3:
		case 5:
		case 6:
		case 8:
		case 10:
		case 12:System.out.println("31 day in this month");
		break;
		case 2:System.out.println("29/28 day in this month");
		break;
		case 4:
		case 7:
		case 9:
		case 11:System.out.println("30 day in this month");
		break;
		default: System.out.println("invalide choice");
		break;
		}

	}

}
