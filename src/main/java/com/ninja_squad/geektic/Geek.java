package com.ninja_squad.geektic;

import javax.persistence.*;

/**
 * Created by p0905121 on 22/06/2015.
 */

@Entity
@Table(name="GEEK")
public class Geek {

    @Id
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


    public int getId_g() {
        return id_g;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isSexe() {
        return sexe;
    }

    public String getMail() {
        return mail;
    }
}
