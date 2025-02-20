package streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.*;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//working of forEach
		List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
		Consumer<Integer> con = new Consumer<>() {
			public void accept(Integer n) {
				System.out.println(n);
			}
		};
		nums.forEach(con);
		//compare with earlier example in StreamCreate package.
		//for each can be used either way, forEach takes an object of Consumer and Consumer uses only one method accept.
		/*This code uses the Consumer interface from the java.util.function package. 
		 * A Consumer represents an operation that takes a single input and returns no result. It has one abstract method, accept().
		 * accept() Method: The accept() method in the Consumer interface performs the operation defined in the implementation.
		  In this example, the accept() method prints the integer passed to it.
		 * Using Lambda Expression (Alternative):Since Consumer is a functional interface, you can pass a lambda expression or a method reference directly to forEach.
				Since Consumer is a functional interface, you can simplify the code using a lambda expression:-
					nums.forEach(n->System.out.println(n));
		 */

	}

}
