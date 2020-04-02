/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.roto.controller;

import id.roto.dao.ProductDAO;
import id.roto.dao.ProductDAOMySQL;
import id.roto.model.CrudState;
import id.roto.model.Product;
import java.util.List;
import java.util.Observable;
/**
 *
 * @author Handal-05
 */
public class ProductController extends Observable{
    private ProductDAO dao = new ProductDAOMySQL();
    private CrudState crudState;
    
    public void setDAO(ProductDAO d){
        dao = d;
    }
    
    public void manipulate(Product p, CrudState c){
        boolean result = false;
        this.crudState = c;
        
        switch (c){
            case INSERT:
                result = dao.insert(p);
                break;
            case UPDATE:
                result = dao.update(p);
                break;
            case DELETE:
                result = dao.delete(p);
                break;
        }
        
        setChanged();
        if (result){
            notifyObservers(p);
        }else{
            notifyObservers();
        }
    }
    
    public CrudState getCrudState(){
        return crudState;
    }
    
    public List<Product> getAllProduct() {
        return dao.getAllProduct();
    }
}
