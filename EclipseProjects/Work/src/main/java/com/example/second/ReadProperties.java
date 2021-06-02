package com.example.second;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	public static String getProperties(String key) throws IOException {
	InputStream inputStream=ReadProperties.class.getClassLoader().getResourceAsStream("config.properties");
	Properties myproperties = new Properties();

	myproperties.load(inputStream);
	return myproperties.getProperty(key);
	}
}
