package io.java.spring.category.TestService;


import java.util.List;



import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import io.java.spring.category.Models.PgCategory;
import io.java.spring.category.Repository.PgCategoryRepository;
import io.java.spring.category.Service.PgCategoryService;
import io.java.spring.category.ServiceImpl.PgCategoryServiceImpl;

@RunWith(SpringRunner.class)
public class PgCategoryServiceImplTest {

	@TestConfiguration
	static class PgCategoryServiceImplTestContextConfiguration {

		@Bean
		public PgCategoryService pgCategoryService() {
			return new PgCategoryServiceImpl();
		}
	}

	@Autowired
	private PgCategoryService pgCategoryService;

	@MockBean
	private PgCategoryRepository pgCategoryRepository;

//	@Before
//	public void setup() {
//		PgCategory pgCategory1 = new PgCategory(1, "Anatomy");
//
//		Mockito.when(pgCategoryRepository.g))
//				.thenReturn(value);
//	}

	@Test
	public void getCategoryTest() {
//		Optional<PgCategory> pgCategory = pgCategoryService.getCategory(1);
		List<PgCategory> categories = pgCategoryService.getAllCategories();
		for (PgCategory pgCategory : categories) {
			System.out.println(pgCategory.getCategoryName());
		}

	}

}
