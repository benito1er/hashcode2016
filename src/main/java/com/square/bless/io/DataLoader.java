package com.square.bless.io;

import java.io.InputStream;
import java.util.Scanner;


public class DataLoader {


    

    public TaskManager readResource(String resourceName) {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        return readResource(cl, resourceName);
    }
    
    public TaskManager readResource(ClassLoader cl, String resourceName) {
    	TaskManager res;
        InputStream is = cl.getResourceAsStream(resourceName);
        try {
            res = read(is);
        } finally {
            try { is.close(); } catch(Exception ex) {}
        }
        return res;
    }

    
	public TaskManager read(InputStream is) {
		Scanner scn = new Scanner(is);
		TaskManagerBuilder task = new  TaskManagerBuilder();
		
		String l1 = scn.next();
		int nbRows = Integer.parseInt(l1.split(" ")[0]);
		int nbCol = Integer.parseInt(l1.split(" ")[1]);
		int nbDrones= Integer.parseInt(l1.split(" ")[2]);
		
		
		
		
		
		// System.out.println(String.format("r:%d  s:%d  u:%d  p:%d  m:%d  ", b.rowsCount, b.rowSize, unavailableSlotsCount, b.groupsCount, b.serversCount));
		scn.nextLine(); // ?
	
		
		scn.close(); // => also close InputStream!
		
		return task.taskManager;
	}
	
	


}
