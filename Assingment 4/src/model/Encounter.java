/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author sethu
 */
public class Encounter {
    private Person person;
    private Date date;
    private Vitals vitals;
    
    public Encounter(){
        person = new Person();
        vitals = new Vitals();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Vitals getVitals() {
        return vitals;
    }

    public void setVitals(Vitals vitals) {
        this.vitals = vitals;
    }
    
    @Override
    public String toString(){
        return String.valueOf(vitals.getPulse());
    }
    
    
}
