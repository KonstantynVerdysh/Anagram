package com.ua.foxminded.anagrams;

import java.util.Scanner;

/**
 * @version 1.0 06 May 2020
 * @author Konstantyn Verdysh
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        Anagram anagram = new Anagram();
        System.out.println(anagram.reverseLetterSymbols(userInput));
    }
}
