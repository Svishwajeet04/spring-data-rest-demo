package com.iot83.demo.repos;

import com.iot83.demo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends ListPagingAndSortingRepository<Book, Long>, JpaRepository<Book, Long> {
}

