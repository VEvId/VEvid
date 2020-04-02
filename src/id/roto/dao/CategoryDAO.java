/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.roto.dao;

import id.roto.model.Category;
import java.util.List;

/**
 *
 * @author Handal-05
 */
public interface CategoryDAO {
    
    public boolean insert(Category c);
    
    public boolean update(Category c);
    
    public boolean delete(Category c);
    
    public List<Category> getAllCategory();
    
    public Category getByID(String id);
    
    public List<Category> getByName(String name);
}
