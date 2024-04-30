package com.ifeanyi.AmazonBooksApi.book.repository;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends ReactiveMongoRepository<String, Books> {



}
