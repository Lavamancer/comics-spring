package com.lavamancer.comics.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comic {

    @Id @GeneratedValue
    private Long id;
    private String title;

    @ManyToOne
    private Genre genre;

    @ManyToOne
    private Publisher publisher;
    @ManyToOne
    private Author author;

}
