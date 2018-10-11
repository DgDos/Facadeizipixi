/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author FiJus
 */
public class FacadeFactory {
    public static iFacade getFacade(String tipo){
        if(tipo.equalsIgnoreCase("jpa")){
            return new FacadeJPA();
        }else{
            return new FacadeFEO();
        }
    }
}
