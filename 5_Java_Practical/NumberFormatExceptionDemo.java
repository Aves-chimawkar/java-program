public class NumberFormatExceptionDemo {
    public static void main(String args[]) {
        String str = "abc";
        System.out.println("Initialization of Try Block...");
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
        System.out.println("Out Side of Try and Catch Block.");
    }
}
