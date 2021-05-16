package DataStructure;

public class LinearSearch {

	private static int searchElement(int[] arr, int key) {


		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		int key=70;
		
		System.out.println("Element found at index :"+searchElement(arr,key));
	}

	
}
