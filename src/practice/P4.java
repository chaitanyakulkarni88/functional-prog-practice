package practice;


public class P4 {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method
        Runnable sayable = P4::saySomething;
        // Calling interface method
        sayable.run();
    }
}