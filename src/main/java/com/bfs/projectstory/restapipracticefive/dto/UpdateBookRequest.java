package com.bfs.projectstory.restapipracticefive.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// immutable class -> record
public record UpdateBookRequest(
        @NotBlank
        @Size(min = 2, max = 20)
        String title,

        @Size(min = 2, max = 20)
        @NotBlank
        String author
) {


}
