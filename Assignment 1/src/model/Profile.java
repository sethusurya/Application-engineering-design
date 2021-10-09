/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Sethu
 */
public class Profile {
    private String name;
    private Date dob;
    private String street;
    private Number zipCode;
    private String state;
    private String emailId;
    private Number phone; // 10 digits all number, starting with other than 0
    private Number ssn; // 9 digits all numbers
    private Number healthId; // 10 digits all numbers
    private Number medicalRecordNumber; // 7 digits all numbers
    private String linkedIn;
    private String ipAddress;
    private Image profilePicture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Number getZipCode() {
        return zipCode;
    }

    public void setZipCode(Number zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Number getPhone() {
        return phone;
    }

    public void setPhone(Number phone) {
        this.phone = phone;
    }

    public Number getSsn() {
        return ssn;
    }

    public void setSsn(Number ssn) {
        this.ssn = ssn;
    }

    public Number getHealthId() {
        return healthId;
    }

    public void setHealthId(Number healthId) {
        this.healthId = healthId;
    }

    public Number getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(Number medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Image getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Image profilePicture) {
        this.profilePicture = profilePicture;
    }
    
}
