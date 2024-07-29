package test1;



public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,4,8,3,2,8};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println();
		System.out.println(min);
		
		

	}

}
