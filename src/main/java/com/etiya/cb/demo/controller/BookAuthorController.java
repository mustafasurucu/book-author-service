package com.etiya.cb.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookAuthorController {

    @GetMapping("book-author")
    public ResponseEntity<String> getBookAuthor() {
        return ResponseEntity.ok("Author of the book from book-author-service");
    }
}
