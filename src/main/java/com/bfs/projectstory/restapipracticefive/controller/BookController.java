package com.bfs.projectstory.restapipracticefive.controller;

import com.bfs.projectstory.restapipracticefive.dto.UpdateBookRequest;
import com.bfs.projectstory.restapipracticefive.dto.UpdateBookResponse;
import com.bfs.projectstory.restapipracticefive.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/book")
public class BookController {

    private BookService bookService;

    // put idempotent
    @PutMapping("/{id}") ResponseEntity<UpdateBookResponse> updateBook(@Valid
                                    @RequestBody
                                    UpdateBookRequest request, @PathVariable long id) {

        return ResponseEntity.ok(bookService.updateBook(request, id));
    }

}
