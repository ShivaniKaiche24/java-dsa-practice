package day1;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {24,17,1,90,3};
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max= arr[i];
			}
			
		}
		
		System.out.print("Max Element of an Array :- "+ max);

	}

}
