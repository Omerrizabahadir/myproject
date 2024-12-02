package com.edabit_solutions.singleton_design_pattern;

import java.util.stream.Stream;

/*
Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6

countWords("This is a test") ➞ 4

countWords("What an easy task, right") ➞ 5
 */
public class FoundWordNumberInStringSentence {
    public static int countWords(String s) {


       int wordCount = (int) Stream.of(s.split("\\s+"))
               .filter(word -> !word.isEmpty())
               .count();
        return wordCount;
    }

    public static void main(String[] args) {

        String sentence = "Bu bir örnek cümledir.";
        int wordCount = countWords(sentence);
        System.out.println("Kelime sayısı : "+ wordCount );
    }
}
