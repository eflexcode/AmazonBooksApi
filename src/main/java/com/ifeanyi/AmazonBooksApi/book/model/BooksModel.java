package com.ifeanyi.AmazonBooksApi.book.model;

import lombok.Data;

@Data
public class BooksModel {

    private String ISBN;
    private String title;
    private String author;
    private Integer YearOfPublication;
    private String Publisher;
    private String ImageUrlS;
    private String ImageUrlM;
    private String ImageUrlL;

}
