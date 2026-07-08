package com.bfs.projectstory.restapipracticefive.service;


import com.bfs.projectstory.restapipracticefive.dto.UpdateBookRequest;
import com.bfs.projectstory.restapipracticefive.dto.UpdateBookResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    public UpdateBookResponse updateBook(@Valid UpdateBookRequest request, long id) {
        return null;
    }
}
