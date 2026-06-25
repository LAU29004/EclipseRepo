package com.cart;

import Mall.*;

public interface Shopping {
	void addToCart(Product p) throws AddCartException;
	void checkout();
}
