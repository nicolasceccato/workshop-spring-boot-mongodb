package com.nicolas.workshopmongo.respositories;

import com.nicolas.workshopmongo.domain.Post;
import com.nicolas.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
