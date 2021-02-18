package com.muhutech.productservice.filestore;

import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;

public class ImageStore {
	
	@Autowired
	private AmazonS3 s3;
	
	public void save (String path, String fileName, InputStream InputStream, Optional<Map<String, String>> optionalMetadata) {
		
		ObjectMetadata metadata = new ObjectMetadata();
		
		//optionalMetadata.if
		
		s3.putObject(path, fileName, InputStream, metadata);
		
		
	}
	

}
