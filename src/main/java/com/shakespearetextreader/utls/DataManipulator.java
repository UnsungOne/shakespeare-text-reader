package com.shakespearetextreader.utls;

public interface DataManipulator  {

    long getNumberOfLines(String fileName);
    void getFileWithNonEmptyLines(String fileName);
    long getNumberOfLinesForFileWithNonEmptyLines(String fileName);
    long getTotalNumberOfWords(String fileName);
    void getOnlyUniqueWords (String fileName);
    int getUniqueWords(String fileName);
    void getFileWithSelectedUppercaseedWords (String fileName);
    void getFileWithoutWordsStartingWithCapitalLetters (String fileName);
    void displayTextWithCharactersCount (String fileName);
    void displayTextWithReplacedText (String filename);

}


