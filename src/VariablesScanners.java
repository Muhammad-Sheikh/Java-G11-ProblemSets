import java.util.Scanner;

public class VariablesScanners {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String input = userInput.nextLine();
        System.out.println("Hello s" + input + "!");



    }
}