import static java.lang.System.*;

import java.io.*;

public class Main {

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        String[] options = {"1. - Add", "2. - Subtract", "3. - Multiply", "4. - Power", "5. - Sqrt", "6. - Exit"};

        while (true) {
            out.println("Mit szeretnel?");
            writeStuff(options);
            int response = readStuff();
            switch (response) {
                case 1 -> add();
                case 2 -> sub();
                case 3 -> mul();
                case 4 -> myPow();
                case 5 -> mySqrt();
                case 6 -> exit(0);
                default -> out.println("Enter sth");
            }
        }
    }

    public static void add() {
        out.println("To exit type 0");
        int response = readStuff();
        int responseNow;
        do {
            responseNow = readStuff();
            response += responseNow;
            out.format("Rolling total: %d \n", response);
        } while (responseNow != 0);
    }

    private static void sub() {
        out.println("To exit type 0");
        int response = readStuff();
        int responseNow;
        do {
            responseNow = readStuff();
            response -= responseNow;
            out.format("Rolling total: %d \n", response);
        } while (responseNow != 0);
    }

    private static void mul() {
        out.println("To exit type 0");
        int response = readStuff();
        int responseNow;
        do {
            responseNow = readStuff();
            response *= responseNow;
            out.format("Rolling total: %d \n", response);
        } while (responseNow != 0);
    }

    private static void myPow() {
        out.println("Number");
        int response = readStuff();
        out.println("PowerTo");
        int power = readStuff();
        double result = Math.pow(response, power);
        out.format("Result: %f \n", result);
    }

    private static void mySqrt() {
        out.println("Number");
        int response = readStuff();
        double result = Math.sqrt(response);
        out.format("Result: %f \n", result);
    }

    public static int readStuff() {
        try {
            String a;
            BufferedReader asd = new BufferedReader(new InputStreamReader(in));
            do {
                a = asd.readLine();
            } while (a.isEmpty());
            return Integer.parseInt(a);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void writeStuff(String[] stuff) {
        for (String a : stuff) {
            out.println(a);
        }
    }
}