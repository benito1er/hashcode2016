package com.square.bless;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.square.bless.domain.Order;
import com.square.bless.io.DataLoader;
import com.square.bless.io.TaskManager;



public class MainClass {

	 public static void main(String[] args) throws FileNotFoundException {
	        new MainClass().run("dc.in", "dc.output");
	    }
	    
	    public void run(String intputFile, String outputFile) {
	    	DataLoader dataLoader = new DataLoader();
	    	TaskManager currentTask=	dataLoader.readResource(intputFile);
	    	Order [] orders = currentTask.getOrders();
	    	Map<Integer, List<Order>> distanceOrder =  new HashMap<Integer,List<Order>>();
	    	for(int i =0; i< orders.length; i++){
	    		Order o = orders[i];
	    		
	    		
	    		
	    		
	    	}
	    	
	    	
	    	
	    	
	    	
	    }
}
