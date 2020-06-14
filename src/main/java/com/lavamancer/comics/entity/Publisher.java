package com.lavamancer.comics.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Publisher {

    @Id @GeneratedValue
    private Long id;
    public String name;

}
