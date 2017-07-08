package com.mycompany.ibuffet.dao;

import java.util.List;

import com.mycompany.ibuffet.beans.Product;

public interface ProductDAO {

	public void addProduct(Product product);

	public List<Product> listProduct();

	public void removeProduct(Integer id);
}