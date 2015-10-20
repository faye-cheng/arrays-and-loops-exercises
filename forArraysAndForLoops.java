package arrays_and_for_loops;

public class forArraysAndForLoops {
	// reference to an array to hold some random ints
	private static int myInts[];
	//constant maximum number of elements in the array 
	private static final int MAXNUMS = 100;

	private static void displayMyInts(String msg) {
		System.out.println(msg);
		for (int i = 0; i < myInts.length; i++) {
			System.out.print(myInts[i] + "\t");//tabs between values
			if( i % 10 == 9) {//10 values will be displayed per line
				System.out.println();
			}//if
		}//for
		System.out.println();//makes a blank line at the end
	}//displayMyNumbers

	//find max
	private static int findMax() {
		int max = 0;

		for (int i=0; i < myInts.length; i++) {
			if (myInts[i] > max) {
				max = myInts[i];
			}
		}
		return max;
	}//findMax

	//find min
	private static int findMin() {
		int min = 49;

		for (int i=0; i < myInts.length; i++) {
			if (myInts[i] < min) {
				min = myInts[i];
			}
		}
		return min;
	}//findMin

	//greater than int parameter
	private static void displayIntsGreaterThan21(String msg) {
		System.out.println(msg);
		int count = 0;
		for (int i = 0; i < myInts.length; i++) {
			if (myInts[i] > 21) {
				System.out.print(myInts[i] + "\t");//tabs between values
				count++;
				if( count % 10 == 0) {//10 values will be displayed per line
					System.out.println();
				}//if
			}//if
		}//for
		System.out.println();
	}//displayIntsGreaterThan21

	//display even numbers
	private static void displayEvenInts(String msg) {
		System.out.println(msg);
		int count = 0;
		for (int i = 0; i < myInts.length; i++) {
			if (myInts[i] % 2 == 0) {
				System.out.print(myInts[i] + "\t");//tabs between values
				count++;
				if( count % 10 == 0) {//10 values will be displayed per line
					System.out.println();
				}
			}//if
		}//for
		System.out.println();//makes a blank line at the end
	}//displayEvenInts

	//find even number count
	private static int findEvenIntCount() {
		int evenIntCount = 0;
		for (int i = 0; i < myInts.length; i++) {
			if (myInts[i] % 2 == 0) {
				evenIntCount++;
			}//if
		}//for
		return evenIntCount;
	}//findEvenIntCount

	//display elements in the array backwards

	private static void displayMyIntsBackwards(String msg) {
		System.out.println(msg);
		for(int i=myInts.length - 1; i >= 0; i--){
			System.out.print(myInts[i] + "\t");//tabs between values
			if( i % 10 == 0) {//10 values will be displayed per line
				System.out.println();
			}//if
		}//for
		System.out.println();//makes a blank line at the end
	}//display my numbers backwards

	private static void displayEveryOtherElement(String msg) {
		System.out.println(msg);
		int count = 0;
		for (int i = 0; i < myInts.length; i = i + 2) {
			System.out.print(myInts[i] + "\t");//tabs between values
			count++;
			if( count % 10 == 0) {//10 values will be displayed per line
				System.out.println();
			}//if
		}//for
		System.out.println();
	}//display every other element in the array

	private static int calculateAndReturnSum() {
		int sum = myInts[0];
		for (int i = 1; i < myInts.length; i++) {
			sum += myInts[i];
		} //for
		return sum;
	} //calculate and return sum

	private static int calculateAndReturnSumGreaterThan21() {
		int sum = myInts[0];
		for (int i = 1; i < myInts.length; i++) {
			if (myInts[i] > 21) {
				sum += myInts[i];
			}
		} //for
		return sum;
	} //calculate and return sum of ints greater than 21

	private static void replaceEveryIntValueOf10(String msg, int change) {
		System.out.println(msg);
		int count = 0;
		for (int i = 0; i < myInts.length; i++) {
			if (myInts[i] == change)
			myInts[i] = -1;

			System.out.print(myInts[i] + "\t");//tabs between values
			count++;
			if( count % 10 == 0) {//10 values will be displayed per line
				System.out.println();
			}//if
		}//for
		System.out.println();
	}//replace every int value Of 10 with -1
	
	
	private static void reverseOrderOfElements(String msg) {
		System.out.println(msg);
		for (int i = 0; i < myInts.length/2; i++) {
		int temp = myInts[i];
		myInts[i] = myInts[myInts.length - 1 - i];
		myInts[myInts.length - 1 - i] = temp;		
		} //for
	} //reverse order of elements
	
	private static void rotateArrayByOnePosition(String msg) {
		System.out.println(msg);
		for (int i = 0; i < myInts.length/2; i++) {
			int temp = myInts[i];
			myInts[i] = myInts[myInts.length - 1 - i];
			myInts[myInts.length - 1 - i] = temp;		
			} //for
		} //reverse order of elements
	
	


	public static void main (String args[]) {
		//allocate array to hold the ints
		myInts = new int [MAXNUMS];
		System.out.println("Faye Cheng \n");
		System.out.println("Array will contain " + myInts.length + 
				" random integers in the range 0-49");
		// generate random ints


		// display values in the array with message
		displayMyInts("\nThe ints in the array are: \n");

		int maxNumber = findMax();
		System.out.println("The maximum number in the array is " + maxNumber +"." + "\n");

		int minNumber = findMin();
		System.out.println("The minimum number in the array is " + minNumber +".");

		displayIntsGreaterThan21("\nThe ints greater than 21 are:\n");

		displayEvenInts("\nThe even ints in the array are: \n");

		System.out.println("\nThere are " + findEvenIntCount() + " even ints in the array." + "\n");

		displayMyIntsBackwards("\nThe ints in the array backwards are:\n");

		displayEveryOtherElement("\nThe ints displayed in every other element in the array are:" + "\n");

		System.out.println("\nThe sum of all the elements in the array is: " + calculateAndReturnSum() + "\n");

		System.out.println("\nThe sum of all the elements in the array greater than 21 is: " + calculateAndReturnSumGreaterThan21() + "\n");

		replaceEveryIntValueOf10("\nThe array with every int value 10 replaced with int value -1 is:" + "\n" , 10);
		
		reverseOrderOfElements("\nThe array with the reversed order of elements is: " + "\n");
		
		rotateArrayByOnePosition("\nThe array rotated by one position is: " + "\n");




	}//main
}//ArraysAndForLoops
