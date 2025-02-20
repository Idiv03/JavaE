package streamAPI;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10_000;
		List<Integer> nums = new ArrayList<>(size);
		
		Random ran = new Random();
		
		for(int i = 1; i <= size; i++) {
			nums.add(ran.nextInt(100));
		}
		long startSeq = System.currentTimeMillis();	
		int sum2 = nums.stream()	
						.map(i->{
							try {
								Thread.sleep(1);
							}catch(Exception e) {
								
							}
							return i * 2;
						})
						.mapToInt(i->i)
						.sum();
		long endSeq = System.currentTimeMillis();
		
		long startParallel = System.currentTimeMillis();
		
		int sum3 = nums.parallelStream()
						.map(i->{
							try {
								Thread.sleep(1);
							}catch(Exception e) {
								
							}
							return i * 2;
						})
						.mapToInt(i->i)
						.sum();
		long EndParallel = System.currentTimeMillis();

			System.out.println(sum2+" "+sum3);
			System.out.println("seq: "+(endSeq - startSeq));
			System.out.println("parallel: "+(EndParallel-startParallel));
		

	}

}

/*
 * int size = 10_000;: Defines the size of the list.

List<Integer> nums = new ArrayList<>(size);: Creates an ArrayList with an initial capacity.

Random ran = new Random();: Initializes a Random object.

for(int i = 1; i <= size; i++) { nums.add(ran.nextInt(100)); }: Fills the list with 10,000 random integers between 0 and 99.
 
 *
 *long startSeq = System.currentTimeMillis();: Captures the start time for sequential processing.

nums.stream(): Converts the list to a sequential stream.

.map(i -> { ... }): Maps each element by multiplying it by 2. It also includes a Thread.sleep(1) to simulate a delay of 1 millisecond for each element.

.mapToInt(i -> i): Converts the Stream<Integer> to an IntStream.

.sum();: Sums all the elements of the stream.

long endSeq = System.currentTimeMillis();: Captures the end time for sequential processing.
long startParallel = System.currentTimeMillis();: Captures the start time for parallel processing.

nums.parallelStream(): Converts the list to a parallel stream.

.map(i -> { ... }): Maps each element by multiplying it by 2, with a Thread.sleep(1) delay.

.mapToInt(i -> i): Converts the Stream<Integer> to an IntStream.

.sum();: Sums all the elements of the stream.

long EndParallel = System.currentTimeMillis();: Captures the end time for parallel processing.
 */
