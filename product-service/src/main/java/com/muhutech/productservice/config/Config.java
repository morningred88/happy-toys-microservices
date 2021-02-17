package com.muhutech.productservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter 
@Setter
@ConfigurationProperties("product")
public class Config {
	
	private String accesskey;
	private String secretKey;
	private String signingRegion;
	private String dynamoDBEndpoint;
}
