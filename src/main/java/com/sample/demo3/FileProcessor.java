package com.sample.demo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileProcessor {

	// properties 파일에 입력한 이름으로 주입가능
	// setter메소드 불필요
	@Value("${file.backup.directory}")
	private String directory;
	@Value("${file.backup.filename}")
	private String filename;
	@Value("${file.backup.maxSize}")
	private long maxSize;

	public void process() {
		System.out.println(directory);
		System.out.println(filename);
		System.out.println(maxSize);
	}
}
