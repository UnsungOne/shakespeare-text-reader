package com.shakespearetextreader;

import org.junit.jupiter.api.BeforeAll;

public class ShakespeareAppTests {
    private static ShakespeareAppReader shakespeareAppReader;

    @BeforeAll
    static void setup(){
        TestDataSource dataSource = new TestDataSource();
        shakespeareAppReader = new ShakespeareAppReader(dataSource);
    }


}
