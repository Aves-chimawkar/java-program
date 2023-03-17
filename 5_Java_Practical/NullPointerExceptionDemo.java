public class NullPointerExceptionDemo {
    public static void main(String args[]) {
        System.out.println("Try block Initialization...");
        String str = null;
        try {
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        System.out.println("Out Side of Try and Catch Block.");
    }
}
