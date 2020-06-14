package com.lavamancer.comics.repository;

import com.lavamancer.comics.entity.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepository extends JpaRepository<Comic, Long> {
}
