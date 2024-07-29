package test1;

public class MaxElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30,40,50,60};
		int max=arr[0];
		System.out.println("element of array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print("\t"+arr[i]);
		}
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println( );
		System.out.println("Maximum element is in array:");
		System.out.println(max);

	}

}
