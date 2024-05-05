package com.ifeanyi.AmazonBooksApi.book.entity;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigInteger;

@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @Id
    private Long id;

    private String isbn;

//    @Column(value = "Book-Title")
    private String title;

//    @Column(value = "Book-Author")
    private String author;

//    @Column(value = "Year-Of-Publication")
    private Integer yearOfPublication;

//    @Column(value = "Publisher")
    private String publisher;

//    @Column(value = "Image-URL-S")
    private String imageUrlS;

//    @Column(value = "Image-URL-M")
    private String imageUrlM;

//    @Column(value = "Image-URL-L")
    private String imageUrlL;

}
