/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajpa;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author FiJus
 */
public class DAO {
    private static EntityManagerFactory factory;
    public void shit(Company c){
        factory = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }
}
