package day1;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {31,6,7,86,2};
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("Minnimum Element of an Array :- "+min);
	}

}
