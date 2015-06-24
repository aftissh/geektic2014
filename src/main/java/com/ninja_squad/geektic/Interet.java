package com.ninja_squad.geektic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by p0905121 on 24/06/2015.
 */

@Entity
@Table(name = "CENTREINTERET")
public class Interet {

    @Id
    @Column(name="IDINTERET", nullable = false)
    private int idInteret;
    @Column(name="LIBELLE", nullable = false)
    private String libelle;
}
