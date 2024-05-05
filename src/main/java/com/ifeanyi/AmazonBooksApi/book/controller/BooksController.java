package com.ifeanyi.AmazonBooksApi.book.controller;

import com.ifeanyi.AmazonBooksApi.book.entity.Books;
import com.ifeanyi.AmazonBooksApi.book.model.BooksModel;
import com.ifeanyi.AmazonBooksApi.book.service.BooksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BooksController {

    private BooksService booksService;

    @PostMapping()
    public Mono<Books> createBook(@RequestBody BooksModel booksModel) {
        return booksService.createBook(booksModel);
    }

    @GetMapping("/book/{id}")
    public Mono<Books> getById(@PathVariable Long id) {
        return booksService.getById(id);
    }

    @GetMapping("/isbn/{isbn}")
    public Mono<Books> getByIsbn(@PathVariable String isbn) {
        return booksService.getByISBN(isbn);
    }

    @GetMapping("/title/{title}")
    public Flux<Books> getByTitle(@PathVariable String title) {
        return booksService.getByTitle(title);
    }

    @GetMapping("/author/{author}")
    public Flux<Books> getByAuthor(@PathVariable String author) {
        return booksService.getByBookAuthor(author);
    }
    @GetMapping("/publisher/{publisher}")
    public Flux<Books> getByPublisher(@PathVariable String publisher) {
        return booksService.getByPublisher(publisher);
    }
    @GetMapping("/year_of_publication/{year}")
    public Flux<Books> getByYearOfPublication(@PathVariable Integer year) {
        System.out.println("kkkkkkkkkkkkkkkkkk");
        return booksService.getByYearOfPublication(year);
    }
}
