package com.square.bless.domain;

public class ProductType {

	int pdTypeId;
	int u;

	public ProductType(int pdTypeId, int u) {
		this.pdTypeId = pdTypeId;
		this.u = u;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pdTypeId;
		result = prime * result + u;
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
		ProductType other = (ProductType) obj;
		if (pdTypeId != other.pdTypeId)
			return false;
		if (u != other.u)
			return false;
		return true;
	}

}
