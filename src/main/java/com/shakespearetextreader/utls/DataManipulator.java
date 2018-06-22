package com.shakespearetextreader.utls;

public interface DataManipulator {

    int getNumberOfLines(String fileName);
    void getFileWithEmptyLines(String fileName);
    int getNumberOfEmptyLines(String fileName);
    int getTotalNumberOfWords(String fileName);
    String getOnlyUniqueWords (String fileName);
    int getUniqueWords(String fileName);



}


