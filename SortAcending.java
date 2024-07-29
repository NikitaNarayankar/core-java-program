package test1;

public class SortAcending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,8,1,6,9,3};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("array in acending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}

	}

}
