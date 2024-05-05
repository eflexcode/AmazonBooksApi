package com.ifeanyi.AmazonBooksApi.book.repository;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface BooksRepository extends ReactiveCrudRepository<Books, Long> {

    Flux<Books> findByTitleContainingIgnoreCase(final String title);
    Flux<Books> findByAuthorContainingIgnoreCase(final String author);
    Flux<Books> findByYearOfPublicationContaining(final Integer yearOfPublication);
    Flux<Books> findByPublisherContainingIgnoreCase(final String publisher);

    Mono<Books> findByIsbn(Long isbn);
}
