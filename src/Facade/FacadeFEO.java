/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FiJus
 */
public class FacadeFEO implements iFacade {

    @Override
    public void insert(Object o) {
        try {
            FEO.Company c = (FEO.Company) o;
            FEO.CompanyDAO cd = new FEO.CompanyDAO("bistock");
            cd.createCompany(c);
                    
        } catch (SQLException | URISyntaxException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(FacadeFEO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<FEO.Company> read() {
        try {
            FEO.CompanyDAO cd=new FEO.CompanyDAO("bistock");
            return cd.getAllCompanys();
        } catch (SQLException | URISyntaxException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(FacadeFEO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
