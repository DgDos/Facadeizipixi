/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author FiJus
 */
public class DAO {

    private static EntityManagerFactory factory;

    public void shit(Company c) {
        factory = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
//        em.persist(c);
        pruebajpa.Company cc = new Company();
        Query q = em.createNamedQuery("Company.findAll");
        ArrayList<Company> cs = new ArrayList<>();

        cs = (ArrayList<Company>) q.getResultList();

        em.getTransaction().commit();
        em.close();

    }

    public ArrayList<FEO.Company> shit2() {
        factory = Persistence.createEntityManagerFactory("PruebaJPAPU");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createNamedQuery("Company.findAll");
        List<Company> cs = new ArrayList<>();
        Vector<Company> vs= (Vector<Company>) q.getResultList();
        for (int i = 0; i < vs.size(); i++) {
            cs.add(vs.get(i));
        }
        
        ArrayList<FEO.Company> feo=new ArrayList<>();
        for(Company c: cs){
            FEO.Company feO=new FEO.Company();
            feO.setName(c.getName());
            feO.setEmail(c.getEmail());
            feO.setPassword(c.getPassword());
            feo.add(feO);
        }
        em.getTransaction().commit();
        em.close();
        return feo;
    }
}
