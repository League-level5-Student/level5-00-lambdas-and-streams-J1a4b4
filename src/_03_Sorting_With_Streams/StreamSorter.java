package _03_Sorting_With_Streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamSorter {
	public static void main(String[] args) {
		Integer[] nums = new Integer[50];
		for(int i = 0; i < nums.length; i++) {
			Random rGen = new Random();
			nums[i] = rGen.nextInt();
		}
		
		//1. Convert the Integer array to Stream object.
		Stream<Integer> integers = Stream.of(nums);
		//2. Use the sorted method of the stream to sort the numbers.
		integers = integers.sorted();
		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
		integers.forEach( (integer) -> { System.out.println(integer); } );
	}
}
