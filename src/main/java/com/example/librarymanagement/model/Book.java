package com.example.librarymanagement.model;
import jakarta.persistence.*;
import jakarta.persistence.metamodel.IdentifiableType;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;

    @Column(nullable = false)
    private String bookname;

    @Column(nullable = false)
    private String author;

    @Column( unique = true, nullable = false)
    private String isbn;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false,unique = true)
    private  int totalcopies;

    @Column(nullable = false)
    private int availablecopies;

}
