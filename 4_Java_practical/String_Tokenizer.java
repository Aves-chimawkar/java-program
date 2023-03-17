import java.util.StringTokenizer;
public class String_Tokenizer {
  public static void main(String[] args) {
    String str = "Name : Huzaifa,Id : 10,Year : 1st year Mca,Learning Java ,Learning Python";
    StringTokenizer st = new StringTokenizer(str, ",");
    
    System.out.println("Number of tokens: " + (st.countTokens()-1));
    
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
