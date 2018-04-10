package com.spring.sekhar.schedular;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedular {
	@Scheduled(fixedRate = 5000)
	public void test() {
		System.out.println("test method is calling for every seconds...");

	}

	public static void main(String args[]) throws IOException {
		move_file();
	}

	public static void move_file() throws IOException {
		System.out.println("test method is calling for every seconds...");
		String dirPath = "/Users/spasem/Documents/folder1/";
		File lastModifiedFile = getLatestFilefromDir(dirPath);
		if (lastModifiedFile != null) {
			BufferedReader br = new BufferedReader(new FileReader(lastModifiedFile));

			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(st);
				String[] spltStrs=st.split("|");
				for(String str:spltStrs) {
					System.out.println(str);
				}
				
			}
		}

		lastModifiedFile.renameTo(new File("/Users/spasem/Documents/folder2/logi.json"));
	}

	private static File getLatestFilefromDir(String dirPath) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}
}
