package com.ifeanyi.AmazonBooksApi.book.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Data
public class Books {

    @Id
    private String id;

    private Long ISBN;

    @Field(name = "Book-Title")
    private String BookTitle;

    @Field(name = "Book-Author")
    private String BookAuthor;

    @Field(name = "Year-Of-Publication")
    private Integer YearOfPublication;

    private String Publisher;

    @Field(name = "Image-URL-S")
    private String ImageUrlS;

    @Field(name = "Image-URL-M")
    private String ImageUrlM;

    @Field(name = "Image-URL-L")
    private String ImageUrlL;

}
