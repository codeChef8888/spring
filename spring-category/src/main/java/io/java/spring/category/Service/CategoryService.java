package io.java.spring.category.Service;

import java.util.Optional;

import io.java.spring.category.Models.PrePgCategory;

public interface CategoryService {
	public Object getAllCategories();

	public Optional<PrePgCategory> getCategory(int id);

	public void addCategory(PrePgCategory category);

	public void deleteCategory(int id);

	public void updateCategory(PrePgCategory category);

}
