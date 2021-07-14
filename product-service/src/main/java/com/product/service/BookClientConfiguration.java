package com.product.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.okhttp.OkHttpClient;

@Configuration
public class BookClientConfiguration {

	@Bean
	public OkHttpClient client() {
		return new OkHttpClient();
	}
}
