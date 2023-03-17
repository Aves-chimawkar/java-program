public class ArithmeticExceptionDemo {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 0;
        System.out.println("Try block Initialization...");
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        System.out.println("Out Side of Try and Catch Block.");
    }
}
