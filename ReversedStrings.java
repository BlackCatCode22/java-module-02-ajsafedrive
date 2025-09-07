// ReversedStrings.java
// aj 9/7/25
// I used w3 schools
// https://www.w3schools.com/java/java_howto_reverse_string.asp

public class ReversedStrings {
    public static void main(String[] args) {

        String originalString = "Reversed Strings Practice";
        // initialize empty string
        String reversedString = "";

        // loop time
        for (int i = 0; i < originalString.length(); i++) {
            // add to front
            reversedString = originalString.charAt(i) + reversedString;
        }

        System.out.println("Reversed string results: "+ reversedString);
    }
}