package com.square.bless.domain;

public class Product {

	ProductType pdtype;

	public Product(ProductType productType) {
		this.pdtype = productType;
	}

	public ProductType getPdtype() {
		return pdtype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pdtype == null) ? 0 : pdtype.hashCode());
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
		Product other = (Product) obj;
		if (pdtype == null) {
			if (other.pdtype != null)
				return false;
		} else if (!pdtype.equals(other.pdtype))
			return false;
		return true;
	}

	
}
