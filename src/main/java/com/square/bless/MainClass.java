package com.square.bless;

import java.io.FileNotFoundException;

import com.square.bless.io.DataLoader;
import com.square.bless.io.TaskManager;



public class MainClass {

	 public static void main(String[] args) throws FileNotFoundException {
	        new MainClass().run("dc.in", "dc.output");
	    }
	    
	    public void run(String intputFile, String outputFile) {
	    	DataLoader dataLoader = new DataLoader();
	    	TaskManager currentTask=	dataLoader.readResource(intputFile);
	    }
}
