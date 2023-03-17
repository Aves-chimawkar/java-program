public class String_Builder {
  public static void main(String args[]) {
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.append(" ");
    sb.append("World");
    System.out.println("String made by StringBuilder: " + sb);
    sb.insert(5, " Java");
    System.out.println("After Inserting Into the string : " + sb);
    sb.delete(5, 10);
    System.out.println("After deleting From String: " + sb);
    sb.reverse();
    System.out.println("After reversing The String : " + sb);
    sb.reverse();
    System.out.println("---------------------------\n");
    StringBuilder sb2 = new StringBuilder(sb);
    System.out.println("Copying String by StringBuilder: " + sb2);
    String str = sb.toString();
    System.out.println("---------------------------\n");
    System.out.println("Converted to String: " + str);
    int length = sb.length();
    System.out.println("Length of String: " + length);
    char c = sb.charAt(0);
    System.out.println("First character: " + c);
  }
}
