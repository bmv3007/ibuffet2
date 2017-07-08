package com.mycompany.ibuffet.service;
 
import java.util.List;

import javax.jws.WebService;

import com.mycompany.ibuffet.beans.Product;
import com.mycompany.ibuffet.dao.ProductDAO;
 
 
@WebService
public class ProductServiceImpl implements ProductService {
 
 //   @Autowired
    private ProductDAO productDAO;
 
 //   @Transactional
    public void addProduct(Product product) {
    	productDAO.addProduct(product);
    }
 
 //   @Transactional
    public List<Product> listProduct() {
 
        return productDAO.listProduct();
    }
 
//    @Transactional
    public void removeProduct(Integer id) {
    	productDAO.removeProduct(id);
    }
}