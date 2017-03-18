/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Entities;

import org.BC.Entities.Referralprogram.UserReferralEntity;
import org.BC.Entities.Referralprogram.UserReferralStatusEntity;
import org.BC.Entities.UserMasterEntity;
import java.util.Date;
import java.util.List;


public class UserCreditDetails
{
/**
 *
 * @author gibs
 */
public class UserCreditEntity 
{
    
     // <editor-fold defaultstate="collapsed" desc="Common">
     public long Id;
     public String Code;
     public Date CreatedDate;
     public Date TimeStamp;
     public int VersionId;
     // </editor-fold>
     
     public UserMasterEntity UserMaster_Id;
     public int CurrentCredit;
     public Date LastCreditUpdatedDate;
     public List<UserCreditHistroy> UserCreditHistroy;
     
}
public class UserCreditHistroy
{
     // <editor-fold defaultstate="collapsed" desc="Common">
     public long Id;
     public String Code;
     public Date CreatedDate;
     public Date TimeStamp;
     public int VersionId;
     // </editor-fold>
     
     // <editor-fold defaultstate="collapsed" desc="Reff">
     public UserCreditEntity UserCreditEntity_Id;
     
     //Point get by Upload
     public UserLibrary UploadBook_UserLibrary_Id;
    
     //Point get by reffer a user
     public UserReferralEntity UserReff_UserReferralEntity_Id;
     
     //Point get by register user by using Reffral code
     public UserReferralStatusEntity UserReg_UserReferralStatusEntity_Id;
     
     //Point get by Sold a book
     public UserReferralEntity Sold_UserReferralEntity_Id;
     
     //Point get by Bought a book
     public UserReferralEntity Bought_UserReferralEntity_Id;
     // </editor-fold>
}


}