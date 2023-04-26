//
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class VariablesScanners {
    public static void main(String[] args)
    {
        //VariablesScanners();
        //mathInputs();
        //randOperations();
        //advancedMath();
       //angleOfClock();
        //ifStatements();
        //stringObjects();
        chartoArray();
    }
    //useful public functions
    static void p(String x)
    {
        System.out.println(x);
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
            if(userInput.next().startsWith("y"))
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

        /*
        //Problem 6
        ArrayList<Double> marks = new ArrayList<Double>();
        do {
            System.out.println("Would you like to add marks? (Y or N)");
            if(userInput.next().startsWith("y"))
            {
                System.out.println("Please enter the mark.");
                marks.add(userInput.nextDouble());
            } else {
                break;
            }
        }while (true);
        System.out.println("Enter your course code: ");
        String courseCode = userInput.next();
        System.out.println("Enter your name: ");
        String name = userInput.next();
        System.out.println(name + " , your " + courseCode + " average is " + Math.round((((marks.get(0) + marks.get(1) + marks.get(2))/4) *100) /100));
         */


        //Problem 7
        System.out.println("Enter the time in minutes: ");
        int minInput = userInput.nextInt();
        System.out.println("Your hours is: " + (minInput / 60) + "." + (minInput % 60));


        /*
        //Problem 8
        System.out.println("Enter your max number:");
        int max = userInput.nextInt();
        System.out.println("Enter your min number:");
        int min = userInput.nextInt();
        double randOut = (int)(Math.random()*(max-min+1))+min;
        System.out.println(randOut);\
         */





    }

    static void randOperations()
    {


    }

    static void advancedMath()
    {
        /*
        //Problem 2
        Scanner userInput = new Scanner(System.in);
        p("How many students do you have?");
        int students = userInput.nextInt();
        p("How many apples do you have?");
        int apples = userInput.nextInt();
        p("There will be " + (apples % students) + " apples left");

        System.out.println(((double) students / apples)*4);


        /*
        //Problem 1
        Scanner input = new Scanner(System.in);
        int userInput;


        System.out.print("Enter an integer: ");
        userInput = input.nextInt();
        int prevNum = (userInput - 1);
        int afterNum = (userInput + 1);

        System.out.println("The result is: " + prevNum + ", " + userInput + ", " + afterNum);
        */

        //Problem 4



    }

    static void angleOfClock()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What are your hours?");
        int hours = userInput.nextInt();

        System.out.println("What are your minutes?");
        int minutes = userInput.nextInt();

        System.out.println("What are your seconds?");
        int seconds = userInput.nextInt();

        userInput.close();

        double totalHours = (hours + (minutes/60.0) + (seconds/3600.0));

        DecimalFormat qf = new DecimalFormat("###.##");

        System.out.println("The angle of the hour hand is " + qf.format(totalHours * 30) + "degrees");
    }

    static void ifStatements()
    {
        Scanner userInput = new Scanner(System.in);
        /*
        System.out.println("Whats the first postion? (x * y)");
        int p1 = userInput.nextInt();
        int p2 = userInput.nextInt();

        System.out.println("Whats the final postion? (x * y)");
        int e1 = userInput.nextInt();
        int e2 = userInput.nextInt();

        if((p1 == e1) || (p2 == e2)){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid!");
        }
         */

        /*
        //Number Checker
        System.out.println("Whats your first number?");
        double num1 = userInput.nextInt();
        System.out.println("Whats your second number?");
        double num2 = userInput.nextInt();
        userInput.close();
        if (num1 > num2) { System.out.println(num1 + " is greater than " + num2); }
        else {System.out.println(num2 + " is greater than " + num1);}
         */

        /*
        System.out.println("Whats your number?");
        double num1 = userInput.nextDouble();
        if(num1 % 1 != 0){p("This is a Decimal!");}
        else {p("This is a Int!");}
         */

        /*
        p("Whats the first board position? (X)");
        int xP1 = userInput.nextInt();
        p("Whats the first board position? (Y)");
        int yP1 = userInput.nextInt();
        p("Whats the second board position? (X)");
        int xP2 = userInput.nextInt();
        p("Whats the second board position? (Y)");
        int yP2 = userInput.nextInt();

        if(xP1 % 2 == 0 && xP2 % 2 == 0)
        {
        p("YES");
        }
        else
        {
            p("NO");
        }
         */

        /*
        int num1, num2, decide;
        num1 = (int) (Math.random() * (50 - (-50) + 1) + (-50));
        num2 = (int) (Math.random() * (50 - (-50) + 1) + (-50));
        decide = (int) (Math.random() * (4 - 1 + 1) + 1);
         */

        /*
        p("Enter your number:");
        int num = userInput.nextInt();

        int digit, increment = 0;

        int numSplit = num;

        while (num > 0)
        {
            num = num/10;
            increment++;
        }

        while (numSplit > 0)
        {
            digit = numSplit%10;
            p("digit at " + increment+" is:" + digit);
            numSplit = numSplit/10;
            increment--;
        }
         */

        /*
        long fib1= 0, fib2 = 1,finalfib = 0;
        p("How many number in the fib sequence do you want?");
        int Input = userInput.nextInt();
        for(int i = 0; i<Input ; i++){
            System.out.println(finalfib);
            finalfib = fib1 + fib2;
            long tempFib = finalfib;
            fib2 = finalfib;
         */

        }
        static void stringObjects()
        {
            Scanner userInput = new Scanner(System.in);

            /*
            //Gmail Checker
            p("Enter your message:");
            String message = userInput.next();

            if (message.contains("attach") || message.contains("attached"))
            {
                p("don’t forget to attach your file!");
            } else
            {
                p("Message Sent.");
            }
             */

            /*
            //Pig Latin
            p("What word do you want to convert?");
            String input = userInput.next();
            //Array & Bool declartion
            String vowels [] = {"e", "a", "i", "o", "u"};
            boolean hasVowel = false;
            //Cycles through vowels array to check if the input starts with vowels
            for(int i = 0; i <= 4;i++)
            {
                hasVowel = input.startsWith(vowels[i]);
                //exits loop if vowel is found
                if(hasVowel)
                {
                    break;
                }
            }
            //if a vowel has been found, add hay to the end and print it
            if(hasVowel)
            {
                input = input + "hay";
                p(input);
            }
            //if no vowel is found, move the first letter to the end and add ay
            if (!hasVowel)
            {
                //adds first character to the end of the string
                input = input + input.charAt(0);
                //replaces first instance of first character with nothing
                input = input.replaceFirst(String.valueOf(input.charAt(0)), "");
                //adds ay to the end of the string
                input = input + "ay";
                p(input);
            }
             */

            /*
            //Letter Replacer
            p("Whats your phrase?");
            String input = userInput.next();
            //find first instance of h and makes its index a stored int
            int firstLetter = input.indexOf("h");
            //find last instance of h and makes its index a stored int
            int lastLetter = input.lastIndexOf("h");
            //replaces all 'h' with 'H'
            input = input.replace('h', 'H');
            //Makes a substring from beginning to first instance of h, then adds h and then the rest of the string
            input = input.substring(0, firstLetter) + 'h' + input.substring(firstLetter + 1);
            //Makes a substring from beginning to last instance of h, then adds h and then the rest of the string
            input = input.substring(0, lastLetter) + 'h' + input.substring(lastLetter + 1);
            p(input);
             */

            /*
            //Sorts an array to find second largest number
            p("Enter your 5 ints");
            int numbers[] = {1, 1, 1, 1, 1};
            int currentInput;
            for(int i = 0; i <= 4;i++) {
                currentInput = userInput.nextInt();
                numbers[i] = currentInput;
            }
            Arrays.sort(numbers);
            System.out.println("The second largest number is "+ numbers[3]);
             */

            /*
            p("Enter your 10 ints");
            int numbers[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            int timesAppeared[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            int externalGrabber = 1;
            int counter = 0;

            int currentInput;
            for(int i = 0; i <= 9;i++) {
                currentInput = userInput.nextInt();
                numbers[i] = currentInput;
            }

            for(int currentMassIteration = 0; currentMassIteration <= 9;currentMassIteration++) {
                for(int i = 0; i <= 9;i++) {
                    if (numbers[currentMassIteration] == numbers[i]) {
                        counter++;
                        timesAppeared[currentMassIteration] = counter;
                    }
                }
                counter = 0;
            }

            Arrays.sort(timesAppeared);

            for(int i = 0; i <= 9;i++)
            {
                if (timesAppeared[i] > externalGrabber)
                {
                    System.out.println(externalGrabber);
                    externalGrabber = timesAppeared[i];
                }
            }
            System.out.println(externalGrabber);
            System.out.println(Arrays.toString(timesAppeared));
            System.out.println("The number that appears the most is: " + numbers[externalGrabber]);
             */



            }
    static void chartoArray()
    {

        //Password Checker using Char to Array, ensures duplicate characters get flagged
        Scanner userInput = new Scanner(System.in);

        boolean duplicateChar = false;
        int timesAppeared = 0;

        p("Enter your password:");
        String password = userInput.next();
        char[] passArray = password.toCharArray();

        for(int currentMassIteration = 0; currentMassIteration <= (passArray.length-1);currentMassIteration++)
        {
            for(int i = 0; i <= (passArray.length-1);i++)
            {
                if (passArray[currentMassIteration] == passArray[i])
                {
                    timesAppeared++;
                    if(timesAppeared > 1)
                    {
                        duplicateChar = true;
                    }
                }
            }
            timesAppeared = 0;
        }

        if(duplicateChar)
        {
            p("Bad Password");
        }else {
            p("Good Password");
        }

    }

}

