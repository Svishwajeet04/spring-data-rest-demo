package com.iot83.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Builder
@Table(name = "users")
@NoArgsConstructor
@RestResource
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(targetEntity = Book.class, mappedBy = "buyer")
    private List<Book> booksOwned;
}
