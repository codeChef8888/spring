package io.java.spring.category.ServiceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.spring.category.Models.PgCategory;
import io.java.spring.category.Repository.PgCategoryRepository;
import io.java.spring.category.Service.PgCategoryService;

@Service
public class PgCategoryServiceImpl implements PgCategoryService {

	@Autowired
	PgCategoryRepository categoryRepository;

	@Override
	public List<PgCategory> getAllCategories() {
		List<PgCategory> categories = new ArrayList<>();
		categoryRepository.findAll().forEach(categories::add);
		return categories;
	}

	@Override
	public Optional<PgCategory> getCategory(int id) {
		return categoryRepository.findById(id);
	}

	@Override
	public void addCategory(PgCategory category) {
		Date date = new Date();
		long time = date.getTime();
		Timestamp tm = new Timestamp(time);
		category.setCreatedDate(tm);
		categoryRepository.save(category);

	}

	@Override
	public void deleteCategory(int id) {
		categoryRepository.deleteById(id);

	}

	@Override
	public void updateCategory(PgCategory category) {
		Date date = new Date();
		long time = date.getTime();
		Timestamp tm = new Timestamp(time);
		category.setCreatedDate(tm);
		categoryRepository.save(category);

	}
  
	@Override
	public PgCategory getCategoryName(String name) {
		return categoryRepository.findByCategoryName(name);
	}

}
