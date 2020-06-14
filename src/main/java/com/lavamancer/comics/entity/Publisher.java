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
public class Publisher {

    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "publisher")
    private List<Comic> comics = new ArrayList<>();

}
