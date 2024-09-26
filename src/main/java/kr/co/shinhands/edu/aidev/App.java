package kr.co.shinhands.edu.aidev;

public class App {
    public static void main(String[] args) {
        sayhello("Hello World!");
    }

    private static void sayhello(String message) {
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
        }
    }
}
