package com.shakespearetextreader.utls;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataManipulatorImpl implements DataManipulator {

    List<String> listOfLines = new ArrayList<>();


    @Override
    public long getNumberOfLines(String fileName) {
        try (Stream<String> bufferedReader = Files.lines(Paths.get(fileName))) {
            long lineCount = bufferedReader.count();
            return lineCount;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }


    @Override
    public void getFileWithNonEmptyLines(String fileName) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileName))) {
            list = bufferedReader
                    .lines()
                    .filter(line -> !line.isEmpty())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);
    }


    @Override
    public long getNumberOfLinesForFileWithNonEmptyLines(String fileName) {
        try (Stream<String> bufferedReader = Files.lines(Paths.get(fileName))) {
            long lineCount = bufferedReader
                    .filter(line -> !line.isEmpty())
                    .count();
            return lineCount;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public long getTotalNumberOfWords(String fileName) {
        try (Stream<String> bufferedReader = Files.lines(Paths.get(fileName))) {
            long wordCount = bufferedReader
                    .flatMap(word -> Arrays.stream(word.trim().split(" ")))
                    .count();
            return wordCount;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void getOnlyUniqueWords(String fileName) {
    }

    @Override
    public int getUniqueWords(String fileName) {
        return 0;
    }

    @Override
    public void getFileWithSelectedUppercaseedWords(String fileName) {
        try (Stream<String> bufferedReader = Files.lines(Paths.get(fileName))) {
            listOfLines = bufferedReader
                    .filter(listOfLines -> listOfLines.contains("s"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        listOfLines.forEach(System.out::println);
    }

    @Override
    public void getFileWithoutWordsStartingWithCapitalLetters(String fileName) {

    }

    @Override
    public void displayTextWithCharactersCount(String fileName) {

    }

    @Override
    public void displayTextWithReplacedText(String filename) {

        try (Stream<String> bufferedReader = Files.lines(Paths.get(filename))) {
            listOfLines = bufferedReader
                    .map(line -> line.replaceAll("Król", "Cesarz"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        listOfLines.forEach(System.out::println);
    }
}