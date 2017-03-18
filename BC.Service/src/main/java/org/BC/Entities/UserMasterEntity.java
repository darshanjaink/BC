/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.BC.Framework.IEntity;

/**
 *
 * @author gibs
 */
@Entity
@Table(name = "UserMasterEntity")
public class UserMasterEntity  implements IEntity
{
    
    // <editor-fold defaultstate="collapsed" desc="Common">
     private long Id;
    @Id
    @GeneratedValue
    @Column(name = "Id")
    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }  
      
     private String Code;
     private Date CreatedDate;
     private Date TimeStamp;
     private int VersionId;
     
     
    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public Date getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Date TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public int getVersionId() {
        return VersionId;
    }

    public void setVersionId(int VersionId) {
        this.VersionId = VersionId;
    }

     // </editor-fold>
   
    // <editor-fold defaultstate="collapsed" desc="base User Info">
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private Date   DOB;
    private String RefferalCode;
    
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

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getRefferalCode() {
        return RefferalCode;
    }
    public void setRefferalCode(String RefferalCode) {
        this.RefferalCode = RefferalCode;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Contact Info">
     private String EmailID;
     private String PrimMobNumber;
     private String SecMobNumber;
     private String LandLineNumber;
     
     //private List<AddressEntity> AddressList;
     
     
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

    /*public List<AddressEntity> getAddressList() {
        return AddressList;
    }

    public void setAddressList(List<AddressEntity> AddressList) {
        this.AddressList = AddressList;
    }*/

    // </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="Current Location">
    private double  Latitude;
    private double  Longitude;
    private String  PostalCode;
    private Boolean IsGeoLocationAvailable;
    
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
    
     // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Credentials">
    private String UserId;
    private String Password;
    
    
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
    // </editor-fold>
     
}