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
public class PatientsList {
    private ArrayList<Patient> patientsList;
    
    public PatientsList(){
        patientsList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(ArrayList<Patient> patientsList) {
        this.patientsList = patientsList;
    }
    
    
}
