import java.util.Scanner;
import java.util.Random;

public class Main {
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n",name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    //overload methods = methods that share same name,
    // but different parameters
    //      signature = name + parameters
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }

    static String bakePizza(String breadtype){
        return breadtype+" pizza";
    }

    static String bakePizza(String breadType, String cheeseType){
        return breadType+" "+cheeseType+" pizza";
    }

    public static void main(String[] args) {

        //METHOD = a block of reusable code that is executed when called ()
//        String name = "SpongeBob";
//        int age = 24;
//        happyBirthday(name,age);

        /*//nested loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        Scanner in = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("enter the no. of rows: ");
        rows = in.nextInt();

        System.out.print("enter the no. of columns: ");
        columns = in.nextInt();

        System.out.print("enter the symbol to print: ");
        symbol = in.next().charAt(0);

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        in.close();

        //break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            if (i == 5){
                continue;
            }
            System.out.print(i+" ");
        }


        //Scanner in = new Scanner(System.in);
        System.out.println("enter the day: ");
        String day = in.nextLine();

        //ENHANCED SWITCHES
        switch (day){
            case "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" -> System.out.println("It is a weekday🥺");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend🥳");
            default -> System.out.printf("%s does not exist", day);
        }*/

            //SWITCH STATEMENTS
        /*switch (day){
            case "Monday" -> System.out.println("It is a weekday🥺");
            case "Tuesday" -> System.out.println("It is a weekday🥺");
            case "Wednesday" -> System.out.println("It is a weekday🥺");
            case "Thursday" -> System.out.println("It is a weekday🥺");
            case "Friday" -> System.out.println("It is a weekday🥺");
            case "Saturday" -> System.out.println("It is a weekend🥳");
            case "Sunday" -> System.out.println("It is a weekend🥳");
            default -> System.out.printf("%s does not exist", day);
        }*/


            //ternary operator ?  = Return 1 or 2 values if a condition is true
            // variable = (condition) ? ifTrue : ifFalse;
        /*int score = 70;
        String passORfail = (score >= 60) ? "PASS":"FAIL";
        System.out.println(passORfail);*/
//        //String Methods
//        String name1 = "Bro Code";
//        name1.contains("o"); check if the string contain that character
        /*int length = name1.length();
        char letter = name1.charAt(4);
        int index = name1.indexOf(" ");
        int lastIndex = name1.lastIndexOf("o");
        name1 = name1.toUpperCase();
//        name1 = name1.toLowerCase();
        System.out.printf("%d , %c ,  %d, %d, %s\n",length,letter,index, lastIndex, name1);
//        System.out.print(name1.isEmpty());
        if (name1.isEmpty()){
            System.out.println("Your Name is Empty");
        }
        else {
            System.out.println("Hello "+name1);
        }*/

            //printf format
        /*String name = "spongebob";
        char first_letter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", first_letter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your height is %f cm\n", height);
        System.out.printf("Employed = %b", isEmployed);*/

        /*System.out.println(Math.PI);
        System.out.println(Math.E);
        double result;
//        result= Math.pow(2,3);
        result = Math.abs(-56);
        System.out.println(result);
        double sqrt = Math.sqrt(625);
        System.out.println(sqrt);
        double round = Math.round(3.53636);
        System.out.println(round);*/

        /* floor and ceil method
        to round-off to up use Math.ciel
        to round-off to down use Math.floor
        */

            //random class
//        Random random = new Random();
/*        double num1;
        double num2;
        num1 =  random.nextDouble(1,101);
        num2 =  random.nextDouble(1,101);
        num3 =  random.nextDouble(1,101);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        */
/*        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }*/
        }
    }