//package io.java.spring.category.TestController;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import io.java.spring.category.Models.PgCategory;
//import io.java.spring.category.Repository.PgCategoryRepository;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class PgCategoryRepositoryIntegrationTest {
//
//	@Autowired
//	private PgCategoryRepository pgCategoryRepository;
//
//	@Test
//	public void whenfindByCategoryName() {
//		PgCategory pgCategory = pgCategoryRepository.findByCategoryName("Anatomy");
//
//		assertThat(pgCategory.getCategoryName()).isEqualTo("Anatomy");
//	}
//}
