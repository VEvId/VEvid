/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.roto.dao;

import id.roto.model.Product;
import java.util.List;

/**
 *
 * @author Handal-05
 */
public interface ProductDAO {
    
    public boolean insert(Product p);
    
    public boolean update(Product p);
    
    public boolean delete(Product p);
    
    public List<Product> getAllProduct();
    
    public Product getByID(String id);
    
    public List<Product> getByName(String name);
    
}
