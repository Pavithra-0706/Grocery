/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package store;

/**
 *
 * @author Pavithra
 */
public interface Grocery_store {
    
    public void create();
    public void show();
    public Product choose_prod(int id);
    public void delete(int id);
    
    
}
