package com.ifeanyi.AmazonBooksApi.book.service;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import com.ifeanyi.AmazonBooksApi.book.model.BooksModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BooksService {

    Mono<Books> createBook(BooksModel booksModel);
    Mono<Books> updateBook(BooksModel booksModel);
    Mono<Books> getById(String id);
    Mono<Books> getByISBN(Long ISBN);
    Flux<Books> getByBookTitle(final String bookTitle);
    Flux<Books> getByBookAuthor(final String bookAuthor);
    Flux<Books> getByYearOfPublication(final Integer yearOfPublication);
    Flux<Books> getByPublisher(final String publisher);

    void deleteBook(String id);

}
