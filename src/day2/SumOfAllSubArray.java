package day2;

/*
 * WHAT IS PREFIX SUM?

Pre-compute all sums from index 0, store them. Answer any range query instantly.

Take this array:
index:  0   1   2   3   4
arr:  [ 2,  4,  6,  8,  10 ]
Build a prefix array where each cell = sum of all elements from index 0 up to that index:
prefix[0] = 2
prefix[1] = 2 + 4        = 6
prefix[2] = 2 + 4 + 6    = 12
prefix[3] = 2 + 4 + 6 + 8 = 20
prefix[4] = 2 + 4 + 6 + 8 + 10 = 30
So:
prefix: [ 2, 6, 12, 20, 30 ]

THE MAGIC FORMULA
To get sum from index L to index R:
sum(L, R) = prefix[R] - prefix[L-1]
Example: sum from index 1 to 3?
prefix[3] - prefix[0]
= 20 - 2
= 18

Verify: 4 + 6 + 8 = 18 ✓
 
 * */
public class SumOfAllSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,4,6,8,10};
		int n = arr.length;
		
		int prefix [] = new int[n];
		prefix[0]=arr[0];
		
		for(int i=1 ; i<n ; i++ ) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		
		// range from 1 to 4 
		int L=1 , R=4;
		
		// If L=0 we can't do prefix[L-1] -> that is prefix[-1] -> crash
		int sum ;
		
		if(L==0) {
			sum = prefix[R];
		}
		else {
			sum = prefix[R]-prefix[L-1];
		}
		
		System.out.println("Sum of all SubArray : - "+sum);
		
		
		
		
		
	}

}
