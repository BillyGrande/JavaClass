package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TypedQuery;



@Entity
@Table(name = "\"Secretaries\"")
public class SecretaryDB {

    @Id
    @Column(name = "\"ID\"", nullable = false)
    private String ID;

    @Column(name = "\"Name\"", nullable = false)
    private String Name;

    @Column(name = "\"Surname\"", nullable = false)
    private String Surname;

    @Column(name = "\"Password\"", nullable = false)
    private String Password;

    public String getID() {
        return this.ID;
    }

    public String getName() {
        return this.Name;
    }

    public String getSurname() {
        return this.Surname;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    //public static void returnPassword() {
    //TypedQuery<com.hibernate.SecretaryDB> q = em.createQuery("SELECT b FROM Book b WHERE b.id = :id", com.hibernate.SecretaryDB.class);
    //	q.setParameter("id", 1L);
    //}

}

