import MCA.*;
class Mca_math_min{
 public static void main(String args[]){
MCA.Mathematics math = new MCA.Mathematics();
System.out.println("Sum of two integers: " + math.add(10, 20));
System.out.println("Sum of three floats: " + math.add(1.5f, 2.5f, 3.5f));

System.out.println("----------------------------------------");
MCA.Maximum max = new MCA.Maximum();
System.out.println("Maximum of three integers: " + max.findMaximum(10, 20, 30));
}
}
