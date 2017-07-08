package com.mycompany.ibuffet.service;

import java.util.List;

import com.mycompany.ibuffet.beans.Product;



public interface ProductService {

	public void addProduct(Product product);

	public List<Product> listProduct();

	// @Secured("{ROLE_ADMIN}")
	public void removeProduct(Integer id);
}