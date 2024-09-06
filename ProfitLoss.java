package augProgram;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.print("Enter the cost price: ");
      double costPrice = sc.nextDouble();
      System.out.print("Enter the selling price: ");
      double sellingPrice = sc.nextDouble();
      if(sellingPrice > costPrice) {
          double profit = sellingPrice - costPrice;
          System.out.println("It is a Profit of " + profit);
      } 
      else  {
          double loss = costPrice - sellingPrice;
          System.out.println("It is a Loss of " + loss);
      } 
      

	}

}
