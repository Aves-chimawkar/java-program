public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String args[]) {
        String str = "Hello World!";
        System.out.println("Initialization of Try Block...");
        try {
            char c = str.charAt(20);
            System.out.println("Character at index 20: " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
        System.out.println("Out Side of Try and Catch Block.");
    }
}
