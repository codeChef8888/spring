package io.java.spring.category.Service;

import java.util.List;
import java.util.Optional;

import io.java.spring.category.Models.SubCategory;

public interface SubCategoryService {

	public List<SubCategory> findByCategoryId(int id);

	public Optional<SubCategory> getSubCategory(int id);

	public void addSubCategory(SubCategory subCategory);

	public void updateSubCategory(SubCategory subCategory);

	public void deleteSubcategory(int id);
}
