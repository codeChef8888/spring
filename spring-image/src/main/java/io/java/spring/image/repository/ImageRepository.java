package io.java.spring.image.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.java.spring.image.models.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {

	
}
