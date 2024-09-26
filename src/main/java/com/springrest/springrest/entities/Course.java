package com.springrest.springrest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {

    private long id;
    private String title;
    private String description;

}
