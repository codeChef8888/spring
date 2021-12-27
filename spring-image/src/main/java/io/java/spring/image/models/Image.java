package io.java.spring.image.models;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "images")
public class Image implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Lob
	@Column(name = "image", columnDefinition = "LONGBLOB")
	private byte[] photo;

	@Column(name = "name")
	private String name;

	public Image() {

	}

	public Image(String name, byte[] image) {
		this.name = name;
		this.photo = image;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getImage() {
		return photo;
	}

	public void setImage(byte[] image) {
		this.photo = image;
	}

}
