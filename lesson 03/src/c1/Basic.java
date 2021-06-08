package c1;

public class Basic {

	public static void main(String[] args) {

		int [] arr = {1, 2, 3, 4};
		
		
		//use 'for' loop to iterate over the array
		for (int i  = 0;   i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		//use 'for-each' loop to iterate over the array
		for(int x : arr) {
			System.out.println(x);
			
			
			
		}
	}

}
