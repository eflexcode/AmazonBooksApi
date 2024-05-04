package com.ifeanyi.AmazonBooksApi;

import com.ifeanyi.AmazonBooksApi.util.Util;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazonBooksApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(AmazonBooksApiApplication.class, args);
        Util.streamCsvToDb("C:\\Users\\E.F.Lhomes\\Downloads\\archive(4)\\books2.csv");
    }
}
