/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajpa;


import Facade.FacadeFactory;

/**
 *
 * @author FiJus
 */
public class PruebaJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        FEO.Company c=new FEO.Company();
//        c.setName("mateo");
//        c.setEmail("pepe@hotmail.com");
//        c.setPassword("123");
//        FacadeFactory.getFacade("jpa").insert(c);

        System.out.println(FacadeFactory.getFacade("jpa").read().toString());
    }
    
}
