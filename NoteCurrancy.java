package augProgram;

import java.util.Scanner;

public class NoteCurrancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your amount");
		int amount=sc.nextInt();
		int note500=0,note100=0,note50=0,note10=0,note20=0,note5=0,note2=0,note1=0;
		
		
		if(amount >= 500)
	    {
	        note500 = amount/500;
	        amount -= note500 * 500;
	    }
	    if(amount >= 100)
	    {
	        note100 = amount/100;
	        amount -= note100 * 100;
	    }
	    if(amount >= 50)
	    {
	        note50 = amount/50;
	        amount -= note50 * 50;
	    }
	    if(amount >= 20)
	    {
	        note20 = amount/20;
	        amount -= note20 * 20;
	    }
	    if(amount >= 10)
	    {
	        note10 = amount/10;
	        amount -= note10 * 10;
	    }
	    if(amount >= 5)
	    {
	        note5 = amount/5;
	        amount -= note5 * 5;
	    }
	    if(amount >= 2)
	    {
	        note2 = amount /2;
	        amount -= note2 * 2;
	    }
	    if(amount >= 1)
	    {
	        note1 = amount;
	    }

	    /* Print required notes */
	    System.out.println("Total number of notes = ");
	    System.out.println("500 =" +note500);
	    System.out.println("100 = "+ note100);
	    System.out.println("50 = "+ note50);
	    System.out.println("20 = "+ note20);
	    System.out.println("10 = "+ note10);
	    System.out.println("5 = "+ note5);
	    System.out.println("2 = "+ note2);
	    System.out.println("1 = "+ note1);

	}

}
