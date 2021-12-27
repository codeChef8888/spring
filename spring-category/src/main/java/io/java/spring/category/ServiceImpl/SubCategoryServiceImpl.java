package io.java.spring.category.ServiceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.spring.category.Models.SubCategory;
import io.java.spring.category.Repository.SubCategoryRepository;
import io.java.spring.category.Service.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
	@Autowired
	SubCategoryRepository subCategoryRepository;

	@Override
	public List<SubCategory> findByCategoryId(int id) {
		List<SubCategory> subCategories = new ArrayList<>();
		subCategoryRepository.findByPgCategoryId(id).forEach(subCategories::add);
		return subCategories;
	}

	@Override
	public Optional<SubCategory> getSubCategory(int id) {
		return subCategoryRepository.findById(id);
	}

	@Override
	public void addSubCategory(SubCategory subCategory) {
		Date date = new Date();
		long time = date.getTime();
		Timestamp tm = new Timestamp(time);
		subCategory.setCreatedDate(tm);
		subCategoryRepository.save(subCategory);
		
	}

	@Override
	public void updateSubCategory(SubCategory subCategory) {
		Date date = new Date();
		long time = date.getTime();
		Timestamp tm = new Timestamp(time);
		subCategory.setCreatedDate(tm);
		subCategoryRepository.save(subCategory);
		
	}

	@Override
	public void deleteSubcategory(int id) {
	subCategoryRepository.deleteById(id);
		
	}

	
}
