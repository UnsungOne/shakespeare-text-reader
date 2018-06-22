package com.shakespearetextreader;

import com.shakespearetextreader.utls.DataSource;
import com.shakespearetextreader.utls.ProductionDataSource;

public class ShakespeareAppReader {

    private final DataSource dataSource;

    public ShakespeareAppReader(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        ProductionDataSource dataSource = new ProductionDataSource();
        ShakespeareAppReader shakespeareAppReader = new ShakespeareAppReader(dataSource);
        shakespeareAppReader.dataSource.getFile("makbet.txt");

    }
}
