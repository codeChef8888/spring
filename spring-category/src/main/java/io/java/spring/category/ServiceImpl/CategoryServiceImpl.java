package io.java.spring.category.ServiceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.spring.category.Models.PrePgCategory;
import io.java.spring.category.Repository.CategoryRepository;
import io.java.spring.category.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public Object getAllCategories() {
		List<PrePgCategory> categories=new ArrayList<>();
		categoryRepository.findAll().forEach(categories::add);
		return categories;
	}

	@Override
	public Optional<PrePgCategory> getCategory(int id) {
	return categoryRepository.findById(id);
	}

	@Override
	public void addCategory(PrePgCategory category) {
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
	public void updateCategory(PrePgCategory category) {
		Date date = new Date();
		long time = date.getTime();
		Timestamp tm = new Timestamp(time);
		category.setCreatedDate(tm);
		categoryRepository.save(category);
		
	}

}
