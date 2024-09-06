package augProgram;
import java.util.Scanner;
public class CheckVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your character");
		char c=sc.next().charAt(0);
		if(c=='a'||c=='u'||c=='e'||c=='i'||c=='o')
			System.out.println(c+" is an vowel");
		else
			System.out.println(c+" is consonant");
		
		

	}

}
