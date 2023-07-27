package com.iot83.demo.repos;

import com.iot83.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends ListPagingAndSortingRepository<User, Long>, JpaRepository<User, Long> {
}

