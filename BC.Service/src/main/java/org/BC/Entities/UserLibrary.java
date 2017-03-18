/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Entities;

import org.BC.Entities.UserMasterEntity;
import org.BC.Entities.Book.BookMaster;
import java.util.Date;

/**
 *
 * @author gibs
 */
public class UserLibrary {
   
    // <editor-fold defaultstate="collapsed" desc="Common">
    public long Id;
    public String Code;
    public Date CreatedDate;
    public Date TimeStamp;
    public int VersionId;
    public UserMasterEntity Created_UserMaster_Id;
    public UserMasterEntity LasUpdated_UserMaster_Id;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Book info">    
    public UserMasterEntity UserMaster_Id;
    public BookMaster BookMaster_Id;
      //W: well used
    //N: As new
    //G: Good standard(preset0
    public String QualityOfTheBook ;
    public String QualityOfTheBookLastUpdatedDate ;
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Status">
    
    
    public Date UploadedDate;
    
    public boolean IsForSale;
    public Date IsForSale_StatusChangeDate;
    
    public boolean IsHold;
    public Date IsHold_StatusChangeDate;
    public UserMasterEntity IsHoldFor_UserMasterEntity_Id; 
    
    public boolean IsSoldOut;
    public Date IsSoldOut_StatusChangeDate;
    public UserMasterEntity IsBoughtBy;
     
    public boolean IsHide;
    public Date IsHide_StatusChangeDate;
    
    public boolean IsDisable;
    public Date IsDisable_StatusChangeDate;
    

    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Rule Violation Status">
    //its future feature, admin can disable the books for sale and display to other  users
    //if IsAnyBCRuleViolated =true, book can visible in User My Library only with RuleViolationRemarks
    public Boolean IsAnyBCRuleViolated;
    public Date IsAnyBCRuleViolated_StatusChangeDate;
    
    public UserMasterEntity ViolatedStatusUpdatedBy_UserMasterEntity_Id;
    public String RuleViolationRemarks;
     // </editor-fold>
}
