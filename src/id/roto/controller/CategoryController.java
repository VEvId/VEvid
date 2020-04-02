/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.roto.controller;

import id.roto.dao.CategoryDAO;
import id.roto.dao.CategoryDAOMySQL;
import id.roto.model.Category;
import java.util.List;

/**
 *
 * @author Handal-05
 */
public class CategoryController {
    private CategoryDAO dao = new CategoryDAOMySQL();
    
    public List<Category> getAllData() {
        return dao.getAllCategory();
    }
}
