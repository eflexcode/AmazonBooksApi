package com.ifeanyi.AmazonBooksApi.util;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import com.ifeanyi.AmazonBooksApi.book.model.BooksModel;
import com.ifeanyi.AmazonBooksApi.book.service.BooksService;
import com.opencsv.CSVReader;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Util {

    public  void streamCsvToDb(String csvDirectory,BooksService booksService) {

        String[] readData;
        List<String[]> p = new ArrayList<>();
        List<Books> booksList = new ArrayList<>();

        try {
            CSVReader csvReader = new CSVReader(new FileReader(csvDirectory), ';');
            for (int i = 0; i < 32; i++) {

                BooksModel book = new BooksModel();
                p.add(csvReader.readNext());

                for (int h = 0; h <8; h++) {

                    p.add(csvReader.readNext());
                    if (h == 0) {
                        book.setISBN(p.get(i)[h]);
                    } else if (h == 1) {
                        book.setTitle(p.get(i)[h]);
                    } else if (h == 2) {
                        book.setAuthor(p.get(i)[h]);
                    } else if (h == 3) {
                        book.setYearOfPublication(Integer.valueOf(p.get(i)[h]));
                    } else if (h == 4) {
                        book.setPublisher(p.get(i)[h]);
                    } else if (h == 5) {
                        book.setImageUrlS(p.get(i)[h]);
                    } else if (h == 6) {
                        book.setImageUrlM(p.get(i)[h]);
                    } else {
                        book.setImageUrlL(p.get(i)[h]);
                    }


                }

                System.out.println(book);
                booksService.createBook(book).subscribe();

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
