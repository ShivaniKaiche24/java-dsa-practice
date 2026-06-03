package day1;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,4,76,8,9};
		
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {

                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {

                secondLargest = num;
            }
        }

        System.out.println("Second Largest: " + secondLargest);
	}

}
