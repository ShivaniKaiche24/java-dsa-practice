

package day1;

public class EvenElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6};
		int count=0;
		for(int i=0 ; i<arr.length;i++) {
			
			if(arr[i] % 2==0 ) {
				
				count++;
			}
		}
		
		System.out.println("Count of Even Numbers :- " + count);
	}

}
