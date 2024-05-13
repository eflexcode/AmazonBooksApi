package com.ifeanyi.AmazonBooksApi;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import com.ifeanyi.AmazonBooksApi.book.model.BooksModel;
import com.ifeanyi.AmazonBooksApi.book.service.BooksService;
import com.ifeanyi.AmazonBooksApi.util.Util;
import com.opencsv.CSVReader;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class AmazonBooksApiApplication {

//271379
    public static void main(String[] args) {
        SpringApplication.run(AmazonBooksApiApplication.class, args);
//
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(BooksService booksService){
//
//        return args -> {
//
//            List<String[]> p = new ArrayList<>();
//            List<Books> books = new ArrayList<>();
//
//            try {
//                CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\E.F.Lhomes\\Downloads\\archive(4)\\books2.csv"), ';');
//                for (int i = 0; i < 271379; i++) {
//                    p.add(csvReader.readNext());
//                    if(i > 69391) {
//
//                        Books book = new Books();
//
//
//                        for (int h = 0; h < 8; h++) {
//
//
//                            if (h == 0) {
//                                book.setIsbn(p.get(i)[h] != null ? p.get(i)[h] : null);
//                            } else if (h == 1) {
//                                book.setTitle(p.get(i)[h] != null ? p.get(i)[h] : null);
//                            } else if (h == 2) {
//                                book.setAuthor(p.get(i)[h] != null ? p.get(i)[h] : null);
//                            } else if (h == 3) {
//                                book.setYearOfPublication(Integer.valueOf(p.get(i)[h] != null ? p.get(i)[h] : "0"));
//                            } else if (h == 4) {
//                                book.setPublisher(p.get(i)[h] != null ? p.get(i)[h] : null);
//                            } else if (h == 5) {
//                                book.setImageUrlS(p.get(i)[h] != null ? p.get(i)[h] : null);
//                            } else if (h == 6) {
//                                book.setImageUrlM(p.get(i)[h] != null ? p.get(i)[h] : null);
//                            } else {
//                                book.setImageUrlL(p.get(i)[h] != null ? p.get(i)[h] : null);
//                            }
//
//                        }
//
////                    System.out.println(book);
////                    booksService.createBook(book).subscribe();
//                        books.add(book);
//                        if (i == 271378) {
//                            booksService.saveMany(books).subscribe();
////                        System.out.println(books);
//                        }
//                    }
//                }
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        };
//    }
}
