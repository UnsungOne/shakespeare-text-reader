package com.shakespearetextreader;

import com.shakespearetextreader.utls.DataManipulatorImpl;
import com.shakespearetextreader.utls.DataSource;
import com.shakespearetextreader.utls.ProductionDataSource;

public class ShakespeareAppReader {

    private final DataSource dataSource;
    public ShakespeareAppReader(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        ProductionDataSource dataSource = new ProductionDataSource();
        DataManipulatorImpl dataManipulatorImpl = new DataManipulatorImpl();
        ShakespeareAppReader shakespeareAppReader = new ShakespeareAppReader(dataSource);
//        shakespeareAppReader.dataSource.getFile("makbet.txt");
//        System.out.println("-----------------------------KONIEC PLIKU PIERWSZEGO-----------------------------------");
//        dataManipulatorImpl.getFileWithSelectedUppercaseedWords("makbet.txt");
//        System.out.println("-----------------------------KONIEC PLIKU DRUGIEGO-----------------------------------");
//        System.out.println(dataManipulatorImpl.getNumberOfLines("makbet.txt"));
//        System.out.println("KONIEC");
//        dataManipulatorImpl.getFileWithNonEmptyLines("makbet.txt");
//        System.out.println("KONIEC");
        System.out.println(dataManipulatorImpl.getNumberOfLinesForFileWithNonEmptyLines("makbet.txt"));
        System.out.println("KONIEC");
    }
}
