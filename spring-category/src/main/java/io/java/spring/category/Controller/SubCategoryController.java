package io.java.spring.category.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.spring.category.Models.PgCategory;
import io.java.spring.category.Models.SubCategory;
import io.java.spring.category.ServiceImpl.SubCategoryServiceImpl;

@RestController
@RequestMapping("/prePg")
public class SubCategoryController {
	@Autowired
	SubCategoryServiceImpl subCategoryServiceImpl;
	
	@GetMapping("/categories/{categoryId}/subcategories")
	public ResponseEntity<Object> getAllSubCategories(@PathVariable int categoryId){
		return new ResponseEntity<Object>(subCategoryServiceImpl.findByCategoryId(categoryId),HttpStatus.OK);
	} 

	@GetMapping("/categories/{categoryId}/subcategories/{subCategoryId}")
	public Optional<SubCategory> getById(@PathVariable int subCategoryId){
		return subCategoryServiceImpl.getSubCategory(subCategoryId);
	}
	
	@PostMapping("/categories/{categoryId}/subcategories")
	public void addSubCategory(@RequestBody SubCategory subCategory,@PathVariable int categoryId) {
		subCategory.setPgCategory(new PgCategory(categoryId, ""));
		subCategoryServiceImpl.addSubCategory(subCategory);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/categories/{categoryId}/subcategories/{subCategoryId}")
	public void updateSubCategory(@RequestBody SubCategory subCategory, @PathVariable int categoryId ,@PathVariable int subCategoryId){
		subCategory.setPgCategory(new PgCategory(categoryId, ""));
		subCategory.setSubCategoryId(subCategoryId);
		subCategoryServiceImpl.updateSubCategory(subCategory);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/categories/{categoryId}/subcategories/{subCategoryId}")
	public void deleteSubCategory(@PathVariable int subCategoryId) {
		subCategoryServiceImpl.deleteSubcategory(subCategoryId);
	}

}
