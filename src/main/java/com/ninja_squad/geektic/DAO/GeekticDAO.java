package com.ninja_squad.geektic.DAO;

import org.springframework.stereotype.Repository;
import javax.persistence.*;
import java.util.List;
import com.ninja_squad.geektic.Geek;

/**
 * Created by p0905121 on 22/06/2015.
 */

@Repository
public class GeekticDAO implements IGeekticDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Geek> displayGeek() {
        String reqGeek = "select s from GEEK s";
        TypedQuery<Geek> queryGeek = entityManager.createQuery(reqGeek, Geek.class);
        List<Geek> List_geek = queryGeek.getResultList();
        return List_geek;
    }
}
