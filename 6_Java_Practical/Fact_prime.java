import java.util.Scanner;
class Factorial implements Runnable {
    int num;
    Factorial(int num) {
        this.num = num;
    }
    public void run() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
class Prime implements Runnable {
    int num;
    Prime(int num) {
        this.num = num;
    }
    public void run() {
        int i, flag = 0;
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

class Fact_prime {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        Thread t1 = new Thread(new Factorial(num));
        Thread t2 = new Thread(new Prime(num));
        t1.start();
        t2.start();
    }
}
