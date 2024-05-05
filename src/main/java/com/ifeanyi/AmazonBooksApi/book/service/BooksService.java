package com.ifeanyi.AmazonBooksApi.book.service;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import com.ifeanyi.AmazonBooksApi.book.model.BooksModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface BooksService {

    Mono<Books> createBook(BooksModel booksModel);

    Flux<Books> saveMany(List<Books> books);

    Mono<Books> updateBook(BooksModel booksModel);
    Mono<Books> getById(Long id);
    Mono<Books> getByISBN(String ISBN);
    Flux<Books> getByTitle(final String bookTitle);
    Flux<Books> getByBookAuthor(final String bookAuthor);
    Flux<Books> getByYearOfPublication(final Integer yearOfPublication);
    Flux<Books> getByPublisher(final String publisher);

    void deleteBook(String id);

}
