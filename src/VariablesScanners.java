import java.awt.desktop.SystemSleepEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class VariablesScanners {
    public static void main(String[] args)
    {
        //VariablesScanners();
        mathInputs();
        //randOperations();
    }

    static void VariablesScanners()
    {
        Scanner userInput = new Scanner(System.in);

        /*
        //Problem #1
        System.out.println("What is your name?");
        String input = userInput.nextLine();
        System.out.println("Hello " + input + "!");
         */

        /*
        //Problem #2
        System.out.println("What is your Favourite food?");
        String fav;
        String leastFav;
        fav = userInput.nextLine();
        System.out.println("Whats your least favourite food?");
        leastFav = userInput.nextLine();
        System.out.println("I love " + fav + "!" + " You're right, " +  leastFav + " is disgusting!");
         */

        /*
        //Problem #3
        System.out.println("Enter 3 Numbers:");
        String num1 = userInput.nextLine();
        String num2 = userInput.nextLine();
        String num3 = userInput.nextLine();
        System.out.println(num3 + "," + num2 + "," + num1);
         */

        /*
        //Problem 4
        System.out.println("Give me 2 numbers!");
        int number1 = userInput.nextInt();
        int number2 = userInput.nextInt();
        System.out.println("The output is: " + (number1 + number2));
        */

        /*
        //Problem 5
        System.out.println("Please enter your 4 grades:");
        double grade1 = userInput.nextDouble();
        double grade2 = userInput.nextDouble();
        double grade3 = userInput.nextDouble();
        double grade4 = userInput.nextDouble();
        System.out.println("Your average is: " + ((grade1 +grade2 +grade3 + grade4)/4));
         */

        //Challenge
        /*
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = userInput.nextInt();
        System.out.println("What is your name?");
        String name = userInput2.nextLine();
        System.out.println("Hello " + name + ", " + age +" is a good age to be!");
         */
    }

    static void mathInputs()
    {
        Scanner userInput = new Scanner(System.in);

        /*
        //Problem 1
        int num1, num2;
        System.out.println("Enter your first number:");
        num1 = userInput.nextInt();
        System.out.println("Enter your first number:");
        num2 = userInput.nextInt();
        System.out.println("The sum is: " + (num1+num2));
         */

        /*
        //Problem 2
        int base, height;
        System.out.println("Whats the base of your triangle?");
        base = userInput.nextInt();
        System.out.println("Whats the height of your triangle?");
        height = userInput.nextInt();
        System.out.println("The area of your triangle is " + ((base*height)/2));
         */

        /*
        //Problem 4
        ArrayList<Integer> marks = new ArrayList<Integer>();
        do {
            System.out.println("Would you like to add marks? (Y or N)");
            if(userInput.next().startsWith("Y"))
            {
                System.out.println("Please enter the mark.");
                marks.add(userInput.nextInt());
            } else {
                break;
            }
        }while (true);
        System.out.println("Enter your course code: ");
        String courseCode = userInput.next();
        System.out.println("Enter your name: ");
        String name = userInput.next();
        System.out.println(name + " , your " + courseCode + " average is " + (Math.round((marks.get(0) + marks.get(1) + marks.get(2))/4)));
         */

        /*
        //Problem 5
        System.out.println("Enter the radius of the sphere: ");
        double radius = userInput.nextDouble();
        double volume = ((4/3)*(Math.PI)*(Math.pow(radius, 2)));
        System.out.println("Your volume is: " + volume);
         */


        //Problem 6
                ArrayList<Integer> marks = new ArrayList<Integer>();
        do {
            System.out.println("Would you like to add marks? (Y or N)");
            if(userInput.next().startsWith("Y"))
            {
                System.out.println("Please enter the mark.");
                marks.add(userInput.nextInt());
            } else {
                break;
            }
        }while (true);
        System.out.println("Enter your course code: ");
        String courseCode = userInput.next();
        System.out.println("Enter your name: ");
        String name = userInput.next();
        DecimalFormat df = new DecimalFormat("##.##")
        System.out.println(name + " , your " + courseCode + " average is " + (Math.round((marks.get(0) + marks.get(1) + marks.get(2))/4)));






    }

    static void randOperations()
    {


    }
}

