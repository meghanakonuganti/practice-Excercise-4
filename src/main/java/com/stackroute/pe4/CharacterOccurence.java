package main.java.com.stackroute.pe4;
import java.util.Scanner;
//program to count the total number of occurences in a string

public class CharacterOccurence {

    // Method that return count of the given
    // character in the string
    public static int countOfTheGivenCharacter(String sentence, char c) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {

            // checking character in string

            if (sentence.charAt(i) == c)
                count++;
        }
        return count;
    }


}
