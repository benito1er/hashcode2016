package com.square.bless.domain;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
	int x;
	int y;
	Map<Product,Integer> storages ;
	public Warehouse(int x2, int y2) {
	this.x= x2;
	this.y = y2;
	storages = new HashMap<Product, Integer>();
	}
	public void setStorages(Map<Product, Integer> storages) {
		this.storages = storages;
		
	}
}
