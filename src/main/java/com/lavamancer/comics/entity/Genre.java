package com.lavamancer.comics.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Genre {

    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "genre")
    private List<Comic> comics = new ArrayList<>();

}
