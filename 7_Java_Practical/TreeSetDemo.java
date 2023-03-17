import java.util.TreeSet;
class TreeSetDemo{
    public static void main(String args[]){
        TreeSet<Integer> nums = new TreeSet<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        System.out.println("The Numbers Treeset are :"+nums);
        for(int i : nums){
            System.out.println(i);
        }
        System.out.println("The Size of Numbers TreeSet is : "+nums.size());
        System.out.println("The first Element :"+nums.first());
        System.out.println("The first Element :"+nums.last());
        nums.remove(2);
        System.out.println("After Removing, The Numbers Treeset are :"+nums);
    }
}