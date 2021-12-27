package io.java.spring.category.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.java.spring.category.Models.PgCategory;
import io.java.spring.category.Models.PrePgCategory;

@Repository
public interface PgCategoryRepository extends JpaRepository<PrePgCategory, Integer> {
	public PrePgCategory findByCategoryName(String name);
}
