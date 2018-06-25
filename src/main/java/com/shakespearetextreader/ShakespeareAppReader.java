package com.shakespearetextreader;

import com.shakespearetextreader.utls.DataManipulatorImpl;
import com.shakespearetextreader.utls.DataSource;
import com.shakespearetextreader.utls.ProductionDataSource;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShakespeareAppReader {

    private static DataSource dataSource;
    static Scanner scanner = new Scanner(System.in);

    public ShakespeareAppReader(DataSource dataSource) {

        this.dataSource = dataSource;
    }

    public static void main(String[] args) {

        getUserAtions();
    }

    static void getUserAtions() {
        ProductionDataSource dataSource = new ProductionDataSource();
        DataManipulatorImpl dataManipulatorImpl = new DataManipulatorImpl();
        ShakespeareAppReader shakespeareAppReader = new ShakespeareAppReader(dataSource);
        while (true) {
            System.out.println("Wybierz opcje: \n" +
                    "1 - wczytaj plik \n" +
                    "2 - zlicz iość wierszy \n" +
                    "3 - wczytaj plik bez spaci \n" +
                    "4 - zlicz ilosc wierszy dla pliku bez pustych linii \n" +
                    "5 - zlicz ilość słów \n" +
                    "6 - zamień słowa"
            );

            int choices = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (choices) {
                    case 1:
                        shakespeareAppReader.dataSource.getFile("makbet.txt");

                    case 2:
                        System.out.println(dataManipulatorImpl.getNumberOfLines("makbet.txt"));

                    case 3:
                        dataManipulatorImpl.getFileWithNonEmptyLines("makbet.txt");

                    case 4:

                        System.out.println(dataManipulatorImpl.getNumberOfLinesForFileWithNonEmptyLines("makbet.txt"));
                    case 5:

                        System.out.println(dataManipulatorImpl.getTotalNumberOfWords("makbet.txt"));

                    case 6:
                        dataManipulatorImpl.displayTextWithReplacedText("makbet.txt");
                }

            } catch
                    (InputMismatchException e) {
                e.getStackTrace();
            }

        }
    }
}
