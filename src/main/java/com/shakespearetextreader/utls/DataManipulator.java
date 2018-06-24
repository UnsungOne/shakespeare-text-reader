package com.shakespearetextreader.utls;

public interface DataManipulator extends DataSource {

    long getNumberOfLines(String fileName);
    void getFileWithNonEmptyLines(String fileName);
    long getNumberOfLinesForFileWithNonEmptyLines(String fileName);
    int getTotalNumberOfWords(String fileName);
    String getOnlyUniqueWords (String fileName);
    int getUniqueWords(String fileName);
    void getFileWithSelectedUppercaseedWords (String fileName);



}


