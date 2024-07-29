package test1;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		int[] arr= {1,2,3,1,3,5,6,3};
		for(int i=0;i<arr.length;i++) {
			//removing duplicate element
			if(arr[i]!=arr[i-1]) {
				flag++;
				arr[flag]=arr[i];
			}
			
		}
		System.out.println(flag);
		

	}

}
