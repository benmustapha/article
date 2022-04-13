package com.example.article.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="articleid")
    private Long id;
    private String nom;
    private int prix;
    private String image;

}
