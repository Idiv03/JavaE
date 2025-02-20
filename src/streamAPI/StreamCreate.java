package streamAPI;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		Stream<Integer> s1 = nums.stream();
		
		//operations on stream:-returns new stream to work on
//		Stream<Integer> s2 = s1.filter(n->n%2==0);
//		Stream<Integer> s3 = s2.map(n->n*2);
//		int result = s3.reduce(0, (c,e)-> c+e);
//		//stream can only be used once
//		System.out.println(result);
//		s1.forEach(n->System.out.println(n));
//		
		
		/*
		 * Combines elements of the stream into a single result using a given binary operator.
		 * int result = s3.reduce(0, (c, e) -> c + e); why c and e are used
In the expression int result = s3.reduce(0, (c, e) -> c + e);, the variables c and e are used as placeholders within the lambda expression to represent 
the elements being combined by the reduce() method. Here's a breakdown:

c: This stands for the accumulator. It holds the cumulative result of the reduction operation as it progresses through the elements of the stream.

e: This represents the current element from the stream that is being processed in the current iteration.
How reduce() Works
Initial Value: The reduce method starts with an initial value, in this case, 0.

Binary Operator: The lambda expression (c, e) -> c + e defines a binary operator which is applied to the accumulator and the current element 
to produce a new cumulative result.

For each element in the stream:

The current value of the accumulator (c) and the current element of the stream (e) are added together.

The result of this addition becomes the new value of the accumulator for the next iteration.
		 
		 */
		int result = nums.stream()
						.filter(n->n%2==0)
						.map(n->n*2)
						.reduce(0,(c,e)->c+e);
		System.out.println(result);
		
		
	}

}
