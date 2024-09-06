package array;

public class EvenPositionElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60};
		
		for(int i=0;i<arr.length;i+=2) {
	       
	    System.out.println("even position element are " +arr[i]) ;  
	       
		}
		System.out.println();
		System.out.println("odd position elements are");
		for(int i=1;i<arr.length;i+=2) {
		       
		    System.out.println(arr[i]) ;  
		       
			}
		//System.out.println("even position element are :" +position);
}

}
