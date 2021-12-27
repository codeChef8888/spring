package io.java.spring.category.Service;

import java.util.List;
import java.util.Optional;

import io.java.spring.category.Models.PgCategory;
import io.java.spring.category.Models.PrePgCategory;

public interface PgCategoryService {
	public List<PrePgCategory> getAllCategories();

	public Optional<PgCategory> getCategory(int id);

	public PgCategory getCategoryName(String name);
	
	public void addCategory(PgCategory category);

	public void deleteCategory(int id);

	public void updateCategory(PgCategory category);

}
