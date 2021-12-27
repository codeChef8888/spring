package io.java.spring.category.Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@SuppressWarnings("serial")
@Entity
@Table(name = "subcategory")
@JsonIgnoreType
public class SubCategory implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sub_category_id")
	private int subCategoryId;

	@Column(name = "sub_category_name")
	private String subCategoryName;

	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	@JsonBackReference
	private PrePgCategory prePgCategory;

	public SubCategory() {

	}

	public SubCategory(int subCategoryId, String subCategoryName, int categoryId) {
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.prePgCategory = new PrePgCategory(categoryId, "");
	}

	public PrePgCategory getPgCategory() {
		return prePgCategory;
	}

	public void setPgCategory(PrePgCategory pgCategory) {
		this.prePgCategory = pgCategory;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
