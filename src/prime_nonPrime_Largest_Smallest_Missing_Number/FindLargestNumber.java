package prime_nonPrime_Largest_Smallest_Missing_Number;

public class FindLargestNumber {

	public static void main(String[] args) {
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,
				56,78,90,54,32,123,67,5,679,54,32,65};
		
		//assign first element of an array to largest and smallest
		int largest = array[0];
		
		for(int i=1; i< array.length; i++){
			if(array[i] > largest)
				largest = array[i];
		}
		System.out.println("Largest Number is : " + largest);
	}
}