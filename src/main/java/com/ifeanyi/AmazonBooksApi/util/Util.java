package com.ifeanyi.AmazonBooksApi.util;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import com.opencsv.CSVReader;

import java.awt.print.Book;
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
                p.add(csvReader.readNext());

                for (int h = 0; h<p.get(i).length ; h++){
                    System.out.println(p.get(i)[h]);
                    Books book = new Books();
                    if (h == 0){
                        book.setISBN(p.get(i)[h]);
                    }
                }


            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
