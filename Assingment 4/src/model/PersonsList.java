/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sethu
 */
public class PersonsList {
    private ArrayList<Person> personsList;
    
    public PersonsList(){
    this.personsList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonsList() {
        return personsList;
    }

    public void setPersonsList(ArrayList<Person> personsList) {
        this.personsList = personsList;
    }

    public ArrayList<Person> add(Person newPerson) {
        ArrayList<Person> newPersonsList = personsList;
        newPersonsList.add(newPerson);
        return newPersonsList;
    }

    public ArrayList<Person> remove(Person newSelectedPerson) {
        ArrayList<Person> newPersonsList = personsList;
        newPersonsList.remove(newSelectedPerson);
        return newPersonsList;
    }
      
}
