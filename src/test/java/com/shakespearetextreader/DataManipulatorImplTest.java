package com.shakespearetextreader;

import com.shakespearetextreader.utls.DataManipulatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DataManipulatorImplTest {

    @Test
    void testIfMethodReturnsFourWords(){
        DataManipulatorImpl dataManipulatorTest = new DataManipulatorImpl();
        long wordsCount = dataManipulatorTest.getTotalNumberOfWords("example.txt");
        Assertions.assertTrue(wordsCount == 6);

    }

//    @Test
//    void testIfTextGetsReplaced(){
//        DataManipulatorImpl dataManipulatorTest = new DataManipulatorImpl();
//        String wordToBeReplaced = "program";
//        dataManipulatorTest.displayTextWithReplacedText("example.txt".replaceAll("program", "application"));
//        Assertions.assertSame("application", wordToBeReplaced);
//    }
}
