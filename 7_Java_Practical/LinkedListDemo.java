import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<String> names = new LinkedList<String>();
        LinkedList<Integer> nums = new LinkedList<Integer>();
        names.add("Shown");
        names.add("Maria");
        names.add("Lisa");
        names.add("williams");
        nums.add(10);
        nums.add(-91);
        nums.add(86);
        nums.add(56);
        System.out.println("Names in Linked List : " + names);
        System.out.println("Numbers Linked List : " + nums);
        System.out.println("--------------------------------------------");
        for(int i=0;i<names.size();i++){
        System.out.println("Element at the index "+i+" : "+ names.get(i)); }
        System.out.println("--------------------------------------------");
        for(int i=0;i<nums.size();i++){
        System.out.println("Element at the index "+i+" : "+ nums.get(i)); }
        names.remove(1);
        nums.remove(2);
        System.out.println("After removing elements are : " + names);
        System.out.println("After removing elements are : " + nums);
    }
}
