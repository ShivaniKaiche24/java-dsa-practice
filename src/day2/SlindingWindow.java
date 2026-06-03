package day2;
/* SLIDING WINDOW
THE CORE PROBLEM FIRST
"Find the maximum sum of any subarray of size K."
Brute force — for every starting point, sum the next K elements.
That's O(n × k). Slow.
Sliding window does it in O(n).

THE KEY INSIGHT
When your window moves one step forward:
Window 1:  [1,  2,  3]  4   5
Window 2:   1  [2,  3,  4]  5
You don't recompute the whole sum.
You just:

Remove the element that left the window (left side)
Add the element that entered the window (right side)

new_sum = old_sum - arr[i - 1] + arr[i + k - 1]
One subtraction. One addition. That's it.

DRY RUN
arr = [1, 2, 3, 4, 5],  K = 3
First window — compute normally:
sum = 1 + 2 + 3 = 6
maxSum = 6
Slide the window:
Step 1:
  Remove arr[0] = 1
  Add    arr[3] = 4
  sum = 6 - 1 + 4 = 9
  maxSum = 9

Step 2:
  Remove arr[1] = 2
  Add    arr[4] = 5
  sum = 9 - 2 + 5 = 12
  maxSum = 12
Answer: 12 (subarray [3, 4, 5])*/



public class SlindingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		int k=3;
		int n= arr.length;
		
		int windowSum =0;
		
		// First normal window sum
		for(int i=0 ; i<k ; i++)
		{
			windowSum+=arr[i];
			
		}
		
		int maxSum = windowSum;
		
		// Slide the window 
		for(int i=1;i<k;i++) {
			windowSum=windowSum-arr[i-1]+arr[i+k-1];
			maxSum=Math.max(maxSum, windowSum);
		}
		
		System.out.println("Max sum of  subArray of size " +k+" :- "+maxSum);
		
	}

}
