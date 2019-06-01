package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        Integer i = firstSegment;
        return i.toString() + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        return (input.substring(0, 3));
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        return (input.substring(input.length()-3, input.length()));
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return inputValue == comparableValue;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        return inputValue.charAt(((inputValue.length()-1)/2));
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){

        String a = " ";
        String space = " ";
        int b = 99;

        for (int i = 0; i < spaceDelimitedString.length(); i++) {

            a = (spaceDelimitedString.substring(i, i+1));
            if (a.equalsIgnoreCase(" ")) {
                System.out.println(a + space + b);
                b = i;
                break;
            }
        }

        System.out.println(a + space + b);
        return spaceDelimitedString.substring(0, b);
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){

        String a = " ";
        String space = " ";
        int b = 99;

        for (int i = spaceDelimitedString.length()-1; i >= 0; i--) {

            a = (spaceDelimitedString.substring(i, i+1));
            if (a.equalsIgnoreCase(" ")) {
                System.out.println(a + space + b);
                b = i;
                break;
            }
        }

        System.out.println(a + space + b);
        return spaceDelimitedString.substring(b+1, spaceDelimitedString.length());
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){

        String reverse ="";

        for(int i = 0; i<stringToReverse.length(); i++) {
            reverse = stringToReverse.charAt(i) + reverse;
        }

        return reverse;
    }
}
