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
import io.java.spring.category.ServiceImpl.PgCategoryServiceImpl;

@RestController
@RequestMapping("/prePg")
public class PgCategoryController {

	@Autowired
	PgCategoryServiceImpl categoryServiceImpl;

	@GetMapping("/categories")
	public ResponseEntity<Object> getAllCategories() {
		return new ResponseEntity<Object>(categoryServiceImpl.getAllCategories(), HttpStatus.OK);
	}

	@GetMapping("/categories/{id}")
	public Optional<PgCategory> getCategory(@PathVariable int id) {
		return categoryServiceImpl.getCategory(id);
	}

	@PostMapping("/categories/add")
	public void addCategory(@RequestBody PgCategory category) {
		categoryServiceImpl.addCategory(category);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/categories/delete/{id}")
	public void deleteCategory(@PathVariable int id) {
		categoryServiceImpl.deleteCategory(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/categories/update/{id}")
	public void updateCategory(@PathVariable int id, @RequestBody PgCategory category) {
		category.setCategoryId(id);
		categoryServiceImpl.updateCategory(category);

	}

}
