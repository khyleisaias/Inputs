import java.util.Scanner;

public class Inputs {
    public static String GetString(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        String str_res = input.next();

        if (str_res.equals(null)) {
            System.err.println("Inputs.GetString(): String input cannot be null.");
        }

        return str_res;
    }

    public static int GetInt(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        int int_res = input.nextInt();

        return int_res;
    }
}
