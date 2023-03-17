class HelloJavaThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i+"] "+" Hello Java");
        }
    }
}
public class Hello_java {
    public static void main(String[] args) {
        HelloJavaThread helloJavaThread = new HelloJavaThread();
        helloJavaThread.start();
    }
}
