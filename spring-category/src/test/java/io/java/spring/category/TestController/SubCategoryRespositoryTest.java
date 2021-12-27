//package io.java.spring.category.TestController;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.Iterator;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import io.java.spring.category.Models.SubCategory;
//import io.java.spring.category.Repository.SubCategoryRepository;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class SubCategoryRespositoryTest {
//
//	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Autowired
//	private SubCategoryRepository subCategoryRepository;
//	
//	@Test
//	public void whenfindByPgCategoryId_thenReturnSubcategory() {
//	
//		List<SubCategory> subCategories=subCategoryRepository.findByPgCategoryId(1);
//		
//		for (Iterator iterator = subCategories.iterator(); iterator.hasNext();) {
//			SubCategory subCategory = (SubCategory) iterator.next();
//			System.out.println(subCategory.getSubCategoryName());
//			
//		}
//		
//	}
//}
