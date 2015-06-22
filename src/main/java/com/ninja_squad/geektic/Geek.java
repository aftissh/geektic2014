package com.ninja_squad.geektic;

import javax.persistence.*;

/**
 * Created by p0905121 on 22/06/2015.
 */

@Entity
public class Geek {

    @Column( name = "idgeek" )
    private int id_g;
    @Column( name = "nom" )
    private String lastName;
    @Column( name = "prenom" )
    private String firstName;
    @Column( name = "sexe" )
    private boolean sexe;
    @Column( name = "mail" )
    private String mail;


}
