// aj MaddnessWithMethods.java
// 9/2/25

// First and foremost lets import the scanner class!
import java.util.Scanner;
// next is the normal precursor junk, except I refactored the method.
public class MadnessWithMethods {
    public static void main(String[] args) {


        // test code below
        System.out.printf("INITIATING THE TEST PROTOCOL");
        //create the scanner
        Scanner scanner = new Scanner(System.in);
        // ask user who they are
        System.out.println("\n\nWho are you?");
        String name = scanner.nextLine();
        // takes user input then runs a seperate method attaching hello to the users name
        helloThere(name);

        // define the two integers before taking user input
        int num1 = 0;
        int num2 = 0;

        // take user input for the integers
        System.out.println("\nEnter your first integer");
        num1 = scanner.nextInt();
        System.out.println("\nEnter your second integer");
        num2 = scanner.nextInt();
        // seperate method to add the two integers
        add(num1, num2);




        }
        static void helloThere(String name) {
        System.out.println("\nHello there " + name);
        }
        // I learned so much on this assignment! I got stuck here way too long and utilized W3 schools.
        // I ended up re-doing like 3 times and did it a bit different each time!
        // One example the println was in the main method, and I was using a return.
        // Another example the println was in the method i invoked
        // I also encountered issue with Void vs INT per my w3 reading
        // I also kept going back and forth between defining the value of my int before taking user input, however
        // I am starting to realize that might be arbritrary
        // I also really struggle with naming schemes between nested methods....

        static void add(int num1, int num2){
            int result = num1 + num2;
            // Output of the results
            System.out.println("If you added your two ints together it would be " + (num1 + num2));
        }
    }
