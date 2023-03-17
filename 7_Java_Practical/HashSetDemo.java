import java.util.HashSet;
class HashSetDemo{
    public static void main(String args[]){
        HashSet<String> names = new HashSet<String>();
        System.out.println("Elements of Names HashSet : ");
        names.add("Peter");
        names.add("James");
        names.add("kane");
        names.add("Wane");
        // For each loop
        for (String name : names) {
             System.out.println(name);
            }
        System.out.println("Does Set Contains Kane? "+names.contains("kane"));
        names.remove("James");
        System.out.println("After Removing, Elements of Names HashSet is: "+names);
    }
}