package com.square.bless.domain;

import java.util.Arrays;

public class Order {
	int row;
	int col;
	
	Product [] products;  

	int completionTime;

	public Order(int row, int col, Product[] products) {
		this.row = row;
		this.col = col;
		this.products = products;
	}

	

	public int getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(int completionTime) {
		this.completionTime = completionTime;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public Product[] getProducts() {
		return products;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + completionTime;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + row;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (col != other.col)
			return false;
		if (completionTime != other.completionTime)
			return false;
		if (!Arrays.equals(products, other.products))
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
}
