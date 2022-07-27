package com.eloi;

public class CountOccurence {

    public static void main(String [] args ){
        char[] letters = {'A', 'A','B', 'C', 'D'};

        int count = countOccurences(letters, 'A');
        System.out.println("The count: " + count);
    }

    public static int countOccurences(char [] letters, char searchAbleLetter){
        int count = 0;
        for (char letter : letters) {
            if (letter == searchAbleLetter){
                count++;
            }

        }

        return count;
    }
}
