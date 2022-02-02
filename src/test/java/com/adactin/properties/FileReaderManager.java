package com.adactin.properties;

import com.adactin.helper.Configuration_Reader;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	
	public static FileReaderManager getInstance() {
		FileReaderManager helper = new FileReaderManager();
		return helper;
		
	}
	
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
		
	}

}
