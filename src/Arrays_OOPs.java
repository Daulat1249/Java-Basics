import java.util.Arrays;
import java.util.Scanner;

public class Arrays_OOPs {
    public static void main(String[] args) {
        // array = collection of values of same data type
        /*think of it as a variable that can store more than 1 value*/
//        String[] fruits = {"apple", "mango", "banana","orange", "grapes"};
////        System.out.println(fruits[0]);
////        System.out.println(fruits[2]);
//        int num_of_fruits = fruits.length;
//        System.out.println(num_of_fruits);
//        Arrays.sort(fruits); //sort elements alphabetically
//        // Arrays.fill(fruits, "dragon fruit");
//        // method 1 printing
//        System.out.println(Arrays.toString(fruits));
//        System.out.println();
//        // method 2 printing
//        for(String fruit : fruits){
//            System.out.print(fruit+" ");

//        }
        //Enter user input into an array
        // String[] foods = {}; //this array cannot be modified as it has a fixed length of zero
        /*Scanner in = new Scanner(System.in);

        // String[] foods = new String[5]; //this array has a length of 3

        String[] foods;
        int size_of_foods;

        System.out.print("What # of food items do you want?: ");
        size_of_foods = in.nextInt();
        in.nextLine(); //** remove \n character
        //assign the size of the array using the user input size
        foods = new String[size_of_foods];

        *//*foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "burger";*//*
        for (int i = 0; i < foods.length; i++) {
            System.out.print("enter a food item: ");
            foods[i] = in.nextLine();
        }

        for (String food : foods){
            System.out.print(food+" ");
        }

        in.close();*/

        //SEARCH AN ARRAY
        int[] numbers = {1,9,2,8,3,5,4};
        int target = 7;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]){
                System.out.printf("Element %d found at index: "+i,target);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("element not found!");
        }

    }
}
