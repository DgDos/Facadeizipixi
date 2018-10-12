/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.util.ArrayList;

/**
 *
 * @author FiJus
 */
public interface iFacade {
    public void insert(Object o);
    public ArrayList<FEO.Company> read();
}
