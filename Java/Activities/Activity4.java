package ACTIVITY;

public class Activity4 {


	    public static void main(String[] args) {
	        int[] numbers = {4, 3, 2, 10, 12, 1, 5, 6};

	        System.out.print("Array before Insertion Sort: ");
	        printArray(numbers);

	        // Insertion Sort Logic
	        for (int i = 1; i < numbers.length; i++) {
	            int key = numbers[i];
	            int j = i - 1;

	            // Move elements greater than key forward
	            while (j >= 0 && numbers[j] > key) {
	                numbers[j + 1] = numbers[j];
	                j = j - 1;
	            }
	            numbers[j + 1] = key;
	        }

	        System.out.print("Array after Insertion Sort: ");
	        printArray(numbers);
	    }

	    // Utility method to print array elements
	    private static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}


