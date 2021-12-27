package io.java.spring.image.controller;


import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import org.springframework.util.StringUtils;
import io.java.spring.image.models.Image;
import io.java.spring.image.repository.ImageRepository;

@RestController
@RequestMapping("/")
public class ImageContoller {

	@Autowired
	ImageRepository imageRepository;

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ResponseEntity uploadToDB(@RequestParam("file") MultipartFile file) throws IOException {

		String fname = file.getOriginalFilename();

		if (!(fname.endsWith(".png") || fname.endsWith(".jpg") || fname.endsWith(".jpeg"))) {
			throw new RuntimeException();
		}
		Image photo = new Image();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		photo.setName(fileName);
		try {
			photo.setImage(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		imageRepository.save(photo);
		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/files/download/")
				.path(fileName).toUriString();
		return ResponseEntity.ok(fileDownloadUri);

	}
}
