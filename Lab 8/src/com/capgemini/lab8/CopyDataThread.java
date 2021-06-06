package com.capgemini.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {
	File source;
	File target;
     /**
	 * 
	 * @param source
	 * @param target
	 */
	public CopyDataThread(File source, File target) {
		super();
		this.source = source;
		this.target = target;
	}

	int c = 0;
	int chrctrs = 0;

	public void run() {
		FileInputStream input = null;
		try {
			input = new FileInputStream(source);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(target);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			while ((chrctrs = input.read()) > 0) {
				output.write((char) chrctrs);
				c++;
				if (c % 10 == 0) {
					try {
						System.out.println("Ten characters are copied : ");
						Thread.sleep(5000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}