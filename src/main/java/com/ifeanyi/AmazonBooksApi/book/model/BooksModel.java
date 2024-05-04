package com.ifeanyi.AmazonBooksApi.book.model;

import lombok.Data;

@Data
public class BooksModel {

    private Long ISBN;
    private String BookTitle;
    private String BookAuthor;
    private Integer YearOfPublication;
    private String Publisher;
    private String ImageUrlS;
    private String ImageUrlM;
    private String ImageUrlL;

}
