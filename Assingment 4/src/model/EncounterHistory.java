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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory(){
        encounterHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public ArrayList<Encounter> addEncounter(int index,Encounter newEncounter) {
        ArrayList<Encounter> newEncounterHistory = encounterHistory;
        newEncounterHistory.add(index,newEncounter);
        return newEncounterHistory;
    }

    public ArrayList<Encounter> remove(Encounter newEncounter) {
        ArrayList<Encounter> newEncounterHistory = encounterHistory;
        newEncounterHistory.remove(newEncounter);
        return newEncounterHistory;
    }

    public ArrayList<Encounter> editEncounter(int index, Encounter newEncounter) {
        ArrayList<Encounter> newEncounterHistory = encounterHistory;
        newEncounterHistory.set(index, newEncounter);
        return newEncounterHistory;
    }
    
    
}
