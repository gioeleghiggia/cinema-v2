/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.cinema.control;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;

import it.tss.cinema.Control;
import it.tss.cinema.entity.Ocupazione;
import java.util.List;

@Control
public class OcupazioneStore extends AbstractStore<Ocupazione> {
    
       public OcupazioneStore() {
        super(Ocupazione.class);
    }
       
    public List<Ocupazione> all() {
        return em.createNamedQuery(Ocupazione.FIND_ALL, Ocupazione.class)
                .getResultList();
    }
    
    
        public List<Ocupazione> findbyprog(int prog_id) {
        return em.createNamedQuery(Ocupazione.FIND_BY_PROG)
                .setParameter("prog_id", prog_id)
                .getResultList();
    }
    

    
}

