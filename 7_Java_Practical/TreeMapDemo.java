import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args) {
        // Creating a TreeMap to store student information
        TreeMap<String, Integer> student = new TreeMap<String, Integer>();
        // Adding student information to the TreeMap
        student.put("John", 18);
        student.put("Mary", 19);
        student.put("Tom", 17);
        // Displaying the student TreeMap
        System.out.println("Student TreeMap: " + student);
        // Accessing an element from the student TreeMap
        int age = student.get("Mary");
        System.out.println("Mary's age: " + age);
        System.out.println("The Size of Product HashMap is :"+student.size());
        // Removing an element from the student TreeMap
        student.remove("John");
        System.out.println("After removing John: " + student);
        System.out.println("The Size of Product HashMap is :"+student.size());
    }
}
