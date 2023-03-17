import java.util.Scanner;
class EvenThread implements Runnable {
    public void run() {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= 50; i += 2) {
            sb.append(i).append(" ");
        }
        System.out.println("Even Numbers From 1 to 50 Are : " + sb.toString());
    }
}
class VowelThread implements Runnable {
    private static final String vowels = "AEIOUaeiou";
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or String : ");
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) >= 0) {
                sb.append(word.charAt(i)).append(" ");
            }
        }
        System.out.println("Vowels In The Given String Are : " + sb.toString());
    }
}
public class Two_thread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        VowelThread vowelThread = new VowelThread();
        Thread t1 = new Thread(evenThread);
        Thread t2 = new Thread(vowelThread);
        t1.start();
        t2.start();
    }
}
