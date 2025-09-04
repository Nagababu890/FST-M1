package ACTIVITY;

public class Activity2 {
	
	    public static void main(String[] args) {
	        int[] numbers = {10, 77, 10, 54, -11, 10};
	        int sum = 0;

	        // Sum only the 10's in the array
	        for (int number : numbers) {
	            if (number == 10) {
	                sum += number;
	            }
	        }

	        // Check if sum is exactly 30
	        boolean result = (sum == 30);
	        System.out.println(result);
	    }
	}


