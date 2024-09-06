package array;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,30,50,100,340};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("largest element is " +max);

	}

}
