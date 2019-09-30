package com.example.springbootmongo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends MongoRepository<Book, String> {

    public Book findByTitle(@Param("title") String title);
    public List<Book> findByType(@Param("type") String type);
    public List<Book> findByAuthor(@Param("author") String author);

}