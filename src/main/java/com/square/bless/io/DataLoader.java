package com.square.bless.io;

import java.io.InputStream;

public class DataLoader {

	public TaskManager readResource(String resourceName) {
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		return readResource(cl, resourceName);
	}

	public TaskManager readResource(ClassLoader cl, String resourceName) {
		TaskManager res = new TaskManager();
		InputStream is = cl.getResourceAsStream(resourceName);
		try {
			res.load(is);
		} finally {
			try {
				is.close();
			} catch (Exception ex) {
			}
		}
		return res;
	}

}
