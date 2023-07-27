package com.iot83.demo.repos;

import com.iot83.demo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "author", path = "author")
public interface AuthorRepository extends ListPagingAndSortingRepository<Author, Long>, JpaRepository<Author, Long> {
}
