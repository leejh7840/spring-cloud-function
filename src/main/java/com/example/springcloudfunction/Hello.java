package com.example.springcloudfunction;

import java.util.function.Function;

public class Hello implements Function<String, String> {

	@Override
	public String apply(String t) {
		return "Hello " + t;
	}

}
