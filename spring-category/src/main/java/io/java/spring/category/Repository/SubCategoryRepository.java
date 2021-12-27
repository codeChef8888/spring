package io.java.spring.category.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.java.spring.category.Models.SubCategory;


@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {
	public List<SubCategory> findByPrePgCategoryId(int id);
}
