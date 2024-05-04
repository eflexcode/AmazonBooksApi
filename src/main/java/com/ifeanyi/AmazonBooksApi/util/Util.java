package com.ifeanyi.AmazonBooksApi.util;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {


    public static void streamCsvToDb(String csvDirectory){

        String[] readData;
        List<String[]> p = new ArrayList<>();

        try {
            CSVReader csvReader = new CSVReader(new FileReader(csvDirectory), ';');
            for (int i = 0 ; i < 120 ;i ++){
                p.add( csvReader.readNext());
//                for (int j = 0 ; j < 120 ;j ++){
                    System.out.println(Arrays.toString(p.get(i)));
//                }
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
