/**
 * 
 */
package com.ua.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

/**
 * @author Konstantyn Verdysh
 *
 */
public class AnagramTest {
    private Anagram anagram = new Anagram();
    /**
     * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
     */
    @Test
    public void reverseLetterSymbols_SouldNotThrowExceptionWhenInputIsNull() {
    	assertNull(anagram.reverseLetterSymbols(null));
    }
	/**
	 * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
	 */
	@ParameterizedTest
	@CsvSource(value = {"' ':' '", "'     ':'     '"}, delimiter = ':')
	public void reverseLetterSymbols_ShouldReturnStringWithSizeEqualToInputStringSize(String input, String expected) {
		String actual = anagram.reverseLetterSymbols(input);
	    assertEquals(expected, actual);
	}
	/**
	 * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
	 */
	@ParameterizedTest
	@CsvSource(value = {"Hello World!:olleH dlroW!", "a1bcd efg!h:d1cba hgf!e", "@#cba ^&kji ~* lbi:@#abc ^&ijk ~* ibl"}, delimiter = ':')
	public void reverseLetterSymbols_ShouldReturnStringWithReverseLettersWhenInputIsLettersAndNonLetters(String input, String expected) {
		String actual = anagram.reverseLetterSymbols(input);
	    assertEquals(expected, actual);
	}
    /**
     * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
     */
    @Test
    public void reverseLetterSymbols_ShouldReturnEmptyStringWhenInputIsEmptyString() {
        String expected = "";
        String actual = anagram.reverseLetterSymbols("");
        assertEquals(expected, actual);
    }
	/**
	 * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
	 */
	@ParameterizedTest
	@CsvSource(value = {"1234:1234", "'11  ':'11  '", "333:333"}, delimiter = ':')
	public void reverseLetterSymbols_ShouldNotReverseAnySymbolWhenInputIsNumbersAndSpaces(String input, String expected) {
		String actual = anagram.reverseLetterSymbols(input);
	    assertEquals(expected, actual);
	}
    /**
     * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
     */
    @Test
    public void reverseLetterSymbols_ShouldReturnTheSameStringWhenInputIsLetterSymbol() {
        String expected = "d";
        String actual = anagram.reverseLetterSymbols("d");
        assertEquals(expected, actual);
    }
    /**
     * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
     */
    @Test
    public void reverseLetterSymbols_ShouldReverseStringBySpacesWhenInputIsLettersAndSpaces() {
        String expected = "Aaa bbB";
        String actual = anagram.reverseLetterSymbols("aaA Bbb");
        assertEquals(expected, actual);
    }
    /**
     * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
     */
    @Test
    public void reverseLetterSymbols_ShouldReturnReverseStringWhenInputIsLetters() {
        String expected = "aAaBbBCCC";
        String actual = anagram.reverseLetterSymbols("CCCBbBaAa");
        assertEquals(expected, actual);
    }
    /**
     * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
     */
    @Test
    public void reverseLetterSymbols_ShouldReturnTheSameStringWhenInputIsTheSameLetters() {
        String expected = "vvvvv";
        String actual = anagram.reverseLetterSymbols("vvvvv");
        assertEquals(expected, actual);
    }
	/**
	 * Test method for {@link com.ua.foxminded.anagrams.Anagram#reverseLetterSymbols(java.lang.String)}.
	 */
	@ParameterizedTest
	@CsvSource(value = {"!@#$%:!@#$%", "'^^^   ':'^^^   '", "   $@   :   $@   "}, delimiter = ':')
	public void reverseLetterSymbols_ShouldNotReverseStringWhenInputContainsOnlyNonLetters(String input, String expected) {
		String actual = anagram.reverseLetterSymbols(input);
	    assertEquals(expected, actual);
	}
}
