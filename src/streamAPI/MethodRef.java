package streamAPI;
import java.util.*;

public class MethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("hi", "bubbu", "betu", "lalla");
		List<String> name = names.stream()
								.map(String::toUpperCase)
								.toList();
		name.forEach(System.out::println);
	}

	/*
	 * This program demonstrates how to use method references and stream operations to transform a list of strings to uppercase and print them. The code performs the following steps:

	Creates a list of strings.

	Converts the list to a stream.

	Maps each string to its uppercase equivalent.

	Collects the transformed strings into a new list.

	Prints each string in the new list.
	 */
	
}
