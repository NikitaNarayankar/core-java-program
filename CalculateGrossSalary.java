package augProgram;

import java.util.Scanner;

public class CalculateGrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the basic salary: ");
        double basicSalary = sc.nextDouble();
        double hra, da, grossSalary;
		if(basicSalary <= 10000) {
            hra = basicSalary * 0.20;//20%
            da = basicSalary * 0.80;//80%
        } else if(basicSalary <= 20000) {
            hra = basicSalary * 0.25;//25%
            da = basicSalary * 0.90;//90%
        } else{
            hra = basicSalary * 0.30;//30%
            da = basicSalary * 0.95;//95%
        }
        grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);

	}

}
