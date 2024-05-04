package com.ifeanyi.AmazonBooksApi.book.repository;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface BooksRepository extends ReactiveCrudRepository<Books, String> {

    Flux<Books> findByTitle(final String title);
    Flux<Books> findByAuthor(final String bookAuthor);
    Flux<Books> findByYearOfPublication(final Integer yearOfPublication);
    Flux<Books> findByPublisher(final String publisher);

    Mono<Books> findByISBN(Long isbn);
}
