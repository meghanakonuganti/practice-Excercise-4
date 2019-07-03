package main.java.com.stackroute.pe4;
//program to replace character in a given string
public class ReplaceCharacter {
    //replace character d with f and l with t
    public static String replaceOfTheGivenCharacter(String sentence) {
        String result=sentence.toLowerCase();
        result=sentence.replace('d','f');
        String replacedString=result.replace('l','t');
        return replacedString;
    }
}