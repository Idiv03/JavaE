package streamAPI;
import java.util.*;
import java.util.stream.IntStream;

class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name) {
        this.name = name;
        
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class ConstructorRef {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> names = Arrays.asList("Div", "Aadi", "Poddar");
        List<Integer> ages = Arrays.asList(23, 24, 100);
        List<Student> students = new ArrayList<>();

        // Correct way to iterate over both lists
	        /*for (int i = 0; i < names.size(); i++) {
	            students.add(new Student(names.get(i), ages.get(i)));
	        }
	
	        System.out.println(students);*/
        //using stream api
	        /*students = names.stream()
	        				.map(name-> new Student(name))
	        				.toList();
	        				------------or---------*/
			students = names.stream()
	        				.map(Student :: new)
	        				.toList();
	        System.out.println(students);
     // Using IntStream to iterate over indices 
//        IntStream.range(0, names.size()) 
//    			.forEach(i -> students.add(new Student(names.get(i), ages.get(i))));
//        System.out.println(students);
        
    }
}
