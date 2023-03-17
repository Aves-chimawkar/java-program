import java.util.ArrayList;
class Array_ListDemo{
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // Adding elements to the names & nums ArrayList
        names.add("John");
        names.add("Sarah");
        names.add("Tom");
        names.add("Mary");
        nums.add(10);
        nums.add(89);
        nums.add(234);
        nums.add(-90);
        System.out.println("Array Names List : " + names);
        System.out.println("Array Numbers List : " + nums);
        System.out.println("--------------------------------------------");
        // Accessing elements from the names & nums ArrayList
        for(int i=0;i<names.size();i++){
          System.out.println("Element at index "+ i+" : " + names.get(i));
        }
        System.out.println("--------------------------------------------");
        for(int i=0;i<nums.size();i++){
          System.out.println("Element at index "+i+" : " + nums.get(i));
        }
        // Removing elements from the names and nums
        names.remove(1);
        nums.remove(3);
        System.out.println("After removing element of names List : " + names);
        System.out.println("After removing element of nums List : " + nums);
    }
}

