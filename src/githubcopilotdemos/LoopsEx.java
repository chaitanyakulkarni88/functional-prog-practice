package githubcopilotdemos;

public class LoopsEx {
    public static void main(String[] args) {
        //example of for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i: " + i);
        }

        //example of for loop with array
        String[] names = { "John", "Doe", "Jane" };
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // example 2 of for loop.

        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println("Value of i: " + i);
        }

        // example 3 of for loop.

        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i: " + i);
        }

        // example 4 of for loop with array.

        String[] names2 = { "John", "Doe", "Jane" };
        for (String name : names2) {
            System.out.println("Name: " + name);
        }

        // example 5 of for loop with array.

        String[] names3 = { "John", "Doe", "Jane" };
        for (String name : names3) {
            System.out.println("Name: " + name);
        }

        // example of while loop
        int i = 0;
        while (i < 5) {
            System.out.println("Value of i: " + i);
            i++;
        }

        //example of for each loop
        String[] names4 = { "John", "Doe", "Jane" };
        for (String name : names4) {
            System.out.println("Name: " + name);
        }

        //example of do while loop

        int i1 = 0;
        do {
            System.out.println("Value of i: " + i1);
            i1++;
        } while (i1 < 5);

        //example for continue and break statement
        for (int i2 = 0; i2 < 5; i2++) {
            if (i2 == 2) {
                continue;
            }
            if (i2 == 4) {
                break;
            }
            System.out.println("Value of i: " + i2);
        }
    }
}
