package com.drivec.repository;

import com.drivec.models.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PhotoRepository extends MongoRepository<Photo,String> {

    @Query("{user: ?0}")
    List<Photo> getAllPhotosByUser(String id);
}
