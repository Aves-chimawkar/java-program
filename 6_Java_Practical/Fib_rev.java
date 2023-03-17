class FibonacciThread extends Thread {
    public void run() {
       int first = 0, second = 1, next;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < 10; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }
}
class ReverseThread extends Thread {
    public void run() {
        for (int i = 20; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class Fib_rev {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        ReverseThread reverseThread = new ReverseThread();
        reverseThread.start();
        System.out.println("Numbers in Reverse Order:");
        fibonacciThread.start();
        System.out.println("Fibonacci Series of First 10 terms:");
    }
}
