package com.ll.docker.article.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Getter
@Setter
public class Article {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String subject;
}

