package com.muhutech.productservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AWSConfig {
	
	@Autowired
	private Config config; 

	@Bean
	public DynamoDBMapper mapper() {

		return new DynamoDBMapper(buildAmazonDynamoDB());
	}
	
	//@Bean
	public AmazonS3 s3(){
		
		return AmazonS3ClientBuilder
				.standard()
				.withCredentials(getAWScredentials())
				.build();			
	}
	

	private AmazonDynamoDB buildAmazonDynamoDB() {	

		return AmazonDynamoDBClientBuilder.standard()
				.withEndpointConfiguration(
						new AwsClientBuilder.EndpointConfiguration(config.getDynamoDBEndpoint(), config.getSigningRegion()))
				.withCredentials(getAWScredentials()).build();
	}

	private AWSCredentialsProvider getAWScredentials() {

		AWSCredentials awsCredentials = new BasicAWSCredentials(config.getAccesskey(), config.getSecretKey());

		AWSCredentialsProvider provider = new AWSStaticCredentialsProvider(awsCredentials);

		return provider;

	}

}
