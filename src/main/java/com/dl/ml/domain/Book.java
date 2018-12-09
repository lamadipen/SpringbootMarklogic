package com.dl.ml.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Builder
@Getter
public class Book {

    private long isbn;
    private String title;
    private String author;
    private double price;
}
