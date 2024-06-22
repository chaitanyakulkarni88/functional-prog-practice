package githubcopilotdemos;

public class ConditionEx {

    public static void main(String[] args) {
        //please give me if else example

        //example 1
        if (true) {
            System.out.println("This is true");
        } else {
            System.out.println("This is false");
        }

        //example 2 with below variables
        String s1 = "Hello";
        String s2 = "Hello";

        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        //example 3

        int a = 10;
        int b = 20;

        if(a > b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }
    }
}
