package githubcopilotdemos;

public class VariableExample {

    // create static,instance and local variables and print them.

    static int staticVariable = 10;

    int instanceVariable = 20;

    public static void main(String[] args) {
        VariableExample variableExample = new VariableExample();
        variableExample.printVariables();
    }

    public void printVariables() {
        int localVariable = 30;
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Local Variable: " + localVariable);
    }

    //write a method to sum two numbers and return the result

    public int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }

}
