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
    public Mono<Books> createBook(@RequestBody BooksModel booksModel){
        System.out.println("ggggggggggggg con");
      return booksService.createBook(booksModel);
    } @GetMapping("/book/{id}")
    public Mono<Books> getById(@PathVariable String id){
        System.out.println("ggggggggggggg con");
      return booksService.getById(id);
    }
    @GetMapping("/{title}")
    public Flux<Books> getByTitle(@PathVariable String title){
        System.out.println("ggggggggggggg con");
      return booksService.getByBookTitle(title);
    }

}
