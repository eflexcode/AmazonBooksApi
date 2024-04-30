package com.ifeanyi.AmazonBooksApi.book.repository;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface BooksRepository extends ReactiveMongoRepository<Books, String> {

    Flux<Books> findByBookTitle(final String bookTitle);
    Flux<Books> findByBookAuthor(final String bookAuthor);
    Flux<Books> findByYearOfPublication(final Integer yearOfPublication);
    Flux<Books> findByPublisher(final String publisher);

}
