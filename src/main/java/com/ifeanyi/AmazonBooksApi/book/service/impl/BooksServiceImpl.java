package com.ifeanyi.AmazonBooksApi.book.service.impl;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import com.ifeanyi.AmazonBooksApi.book.model.BooksModel;
import com.ifeanyi.AmazonBooksApi.book.repository.BooksRepository;
import com.ifeanyi.AmazonBooksApi.book.service.BooksService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@AllArgsConstructor
public class BooksServiceImpl implements BooksService {

    private BooksRepository booksRepository;

    @Override
    public Mono<Books> createBook(BooksModel booksModel) {

        Books books = new Books();
        BeanUtils.copyProperties(booksModel, books);

        return booksRepository.save(books);
    }
    @Override
    public Flux<Books> saveMany(List<Books> books) {

        return booksRepository.saveAll(books);
    }

    @Override
    public Mono<Books> updateBook(BooksModel booksModel) {
        return null;
    }

    @Override
    public Mono<Books> getById(Long id) {

        return  booksRepository.findById(id);
    }

    @Override
    public Mono<Books> getByISBN(String ISBN) {
        return booksRepository.findByIsbn(ISBN);
    }

    @Override
    public Flux<Books> getByTitle(String bookTitle) {
        return booksRepository.findByTitleContainingIgnoreCase(bookTitle);
    }

    @Override
    public Flux<Books> getByBookAuthor(String bookAuthor) {
        return booksRepository.findByAuthorContainingIgnoreCase(bookAuthor);
    }

    @Override
    public Flux<Books> getByYearOfPublication(Integer yearOfPublication) {
        return booksRepository.findByYearOfPublication(yearOfPublication);
    }

    @Override
    public Flux<Books> getByPublisher(String publisher) {
        return booksRepository.findByPublisherContainingIgnoreCase(publisher);
    }

    @Override
    public void deleteBook(String id) {

    }
}
