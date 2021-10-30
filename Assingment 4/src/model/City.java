package model;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sethu
 */
public class City {
    private ArrayList<Community> communities;
    
    public City(){
        this.communities = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    public ArrayList<Community> add(Community newCommunity){
       ArrayList<Community> newCommunityList = communities;
       newCommunityList.add(newCommunity);
       return newCommunityList;
    }
    
    public ArrayList<Community> remove(Community myCommunity){
       ArrayList<Community> newCommunityList = communities;
       newCommunityList.remove(myCommunity);
       return newCommunityList;
    }
    
    
}
