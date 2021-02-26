package com.muhutech.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.muhutech.productservice.service.ProductImageService;

@RestController
public class ProductImageController {
	
//	@Autowired
	private ProductImageService productImageService;
	
	@PostMapping(
			path = "{prodId}/image/upload",
			consumes=MediaType.MULTIPART_FORM_DATA_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE)
	public void uploadProductImage(@PathVariable ("prodId") String prodId, 
			@RequestParam ("file") MultipartFile file) {
		
		productImageService.uploadImage(prodId, file);
	}

}
