package com.ua.foxminded.anagrams;

import java.util.StringJoiner;

/**
 * Class Anagram rearranging the letters of word or phrase,
 * typically using original letters exactly once.
 * For example, the word anagram can be rearranged into margana, 
 * or the word adobe into abode.
 * The original word or phrase is known as the subject of the anagram. 
 * Any word or phrase that exactly reproduces the letters in another order is an anagram.
 * 
 * @version 1.0 06 May 2020
 * @author Konstantyn Verdysh
 */
public class Anagram {
    private static final String DELIMETER = " ";
    private static final String TRAILING_SYMBOL = "\n";
    /**
     * Method reverseLetterSymbols reverses all the words of input text.
     * All non-letter symbols stay on the same places.
     * 
     * @param string of subjects separated by spaces.
     * @return string of anagrams separated by spaces.
     */
    public String reverseLetterSymbols(String words) {
        if (words == null || words.trim().isEmpty()) {
            return words;
        }
        StringJoiner result = new StringJoiner(DELIMETER);
        for (String word : (words + TRAILING_SYMBOL).split(DELIMETER)) {
            char[] wordUnits = word.toCharArray();
            int leftindex = 0;
            int rightindex = wordUnits.length - 1;
            while (leftindex < rightindex) {
                if (!Character.isLetter(wordUnits[leftindex])) {
                    leftindex++;
                } else if (!Character.isLetter(wordUnits[rightindex])) {
                    rightindex--;
                } else {
                    char temp = wordUnits[leftindex];
                    wordUnits[leftindex] = wordUnits[rightindex];
                    wordUnits[rightindex] = temp;
                    leftindex++;
                    rightindex--;
                }
            }
            result.add(String.valueOf(wordUnits));
        }
        return result.toString().substring(0, result.length() - 1);
    }
}
