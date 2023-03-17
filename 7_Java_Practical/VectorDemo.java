import java.util.Vector;
class VectorDemo {
    public static void main(String args[]){
        Vector<String> fruits = new Vector<String>();
        Vector<Integer> Roll_No = new Vector<Integer>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Guava");
        Roll_No.add(10);
        Roll_No.add(71);
        Roll_No.add(56);
        Roll_No.add(1);
        System.out.println("Elements of Fruits Vector: " + fruits);
        System.out.println("Elements of Roll Number Vector  :" + Roll_No);
        System.out.println("--------------------------------------------");
        for(int i=0;i<fruits.size();i++){
              System.out.println("Elements At index "+i+" : "+fruits.get(i)); }
        System.out.println("--------------------------------------------");
        for(int i=0;i<Roll_No.size();i++){
              System.out.println("Elements At index "+i+" : "+Roll_No.get(i)); }
        fruits.remove(2);
        Roll_No.remove(2);
        System.out.println("After Removing, Elements of Fruits Vector : "+fruits);
        System.out.println("After Removing, Elements of Roll no Vector : "+Roll_No);
    }
}