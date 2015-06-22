package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.Geek;

import javax.persistence.*;
import java.util.List;

/**
 * Created by p0905121 on 22/06/2015.
 */
public class GeekticDAO {

    private EntityManager entityManager;

    public GeekticDAO (EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Geek findById(Long id) {
        //return entityManager.find(Spectacle.class, id);
        String req ="select s from Geek s where s.idgeek = :id ";
        Geek g = entityManager.createQuery(req, Geek.class)
                .setParameter("id", 2)
                .getSingleResult();
        return g;
    }



}
