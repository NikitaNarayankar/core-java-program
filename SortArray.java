package array;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,15,5,70,60,40,100};
		int temp=0;
		System.out.println("original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//sorting logic
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];`
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		//sorted array in ascending order
		System.out.println("descending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
