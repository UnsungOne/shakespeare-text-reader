package com.shakespearetextreader;

import com.shakespearetextreader.utls.DataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDataSource implements DataSource {
    @Override
    public void getFile(String fileName) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileName))) {
            list = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);
    }
}
