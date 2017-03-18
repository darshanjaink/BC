/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.DTO;

import java.util.Date;
import org.BC.Framework.IDTO;

/**
 *
 * @author gibs
 */
public class UserRegisterationDTO implements IDTO{
   
    // <editor-fold defaultstate="collapsed" desc="base User Info">
        public String FirstName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }

    public String getPrimMobNumber() {
        return PrimMobNumber;
    }

    public void setPrimMobNumber(String PrimMobNumber) {
        this.PrimMobNumber = PrimMobNumber;
    }

    public String getSecMobNumber() {
        return SecMobNumber;
    }

    public void setSecMobNumber(String SecMobNumber) {
        this.SecMobNumber = SecMobNumber;
    }

    public String getLandLineNumber() {
        return LandLineNumber;
    }

    public void setLandLineNumber(String LandLineNumber) {
        this.LandLineNumber = LandLineNumber;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    public Boolean getIsGeoLocationAvailable() {
        return IsGeoLocationAvailable;
    }

    public void setIsGeoLocationAvailable(Boolean IsGeoLocationAvailable) {
        this.IsGeoLocationAvailable = IsGeoLocationAvailable;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }


    public String MiddleName;
    public String LastName;
    
    ///Format must be dd/mm/YYYY
    public String   DOB;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Contact Info">
     public String EmailID;
     public String PrimMobNumber;
     public String SecMobNumber;
     public String LandLineNumber;
    // </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="Current Location">
    public double  Latitude;
    public double  Longitude;
    public String  PostalCode;
    public Boolean IsGeoLocationAvailable;
     // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Credentials">
    public String UserId;
    public String Password;
    // </editor-fold>

   
    
    
}
