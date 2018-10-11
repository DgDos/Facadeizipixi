/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import FEO.Company;
import pruebajpa.DAO;

/**
 *
 * @author FiJus
 */
public class FacadeJPA implements iFacade {

    @Override
    public void insert(Object o) {
        FEO.Company c = (FEO.Company) o;
        pruebajpa.Company i= new pruebajpa.Company();
        i.setCompanyId(c.getCompany_id());
        i.setName(c.getName());
        i.setEmail(c.getEmail());
        i.setPassword(c.getPassword());
        DAO d=new DAO();
        d.shit(i);
        
    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
