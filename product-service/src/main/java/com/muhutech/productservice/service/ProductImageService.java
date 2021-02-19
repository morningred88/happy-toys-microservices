package com.muhutech.productservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductImageService {
	
	public void uploadImage(String prodId, MultipartFile file) {
		//1. Check if the image is empty
		//2. Check if the file is image
		//3. Check if the prodId exists in database
		//4. Grab the metadata from file if any
		//5. Upload image in s3 and update database with s3 image link
		
	}

}
