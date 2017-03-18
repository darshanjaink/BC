/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Entities;


import org.BC.Entities.UserMasterEntity;
import java.util.Date;

/**
 *
 * @author gibs
 */
public class Referralprogram {
    
    public class UserReferralEntity {
     
        // <editor-fold defaultstate="collapsed" desc="Common">
        public long Id;
        public String Code;
        public Date CreatedDate;
        public Date TimeStamp;
        public int VersionId;
        public UserMasterEntity Created_UserMaster_Id;
        public UserMasterEntity LasUpdated_UserMaster_Id;
        // </editor-fold>
    
        // <editor-fold defaultstate="collapsed" desc="Referral Info">
        public UserMasterEntity User_Id;
        public String Subject;
        public String Message;
        public String ToEmailId;
        public String ToPhoneNumber;
        
        public UserNotification Refferal_UserNotification_Id;
        // </editor-fold>
        
    }
    
    public class UserReferralStatusEntity
    {
        // <editor-fold defaultstate="collapsed" desc="Common">
        public long Id;
        public String Code;
        public Date CreatedDate;
        public Date TimeStamp;
        public int VersionId;
        //public BOEntities.UserMasterEntity Created_UserMaster_Id;
        //public BOEntities.UserMasterEntity LasUpdated_UserMaster_Id;
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Core Mapping">
         public UserMasterEntity Reffered_User_Id;
         public UserMasterEntity NewRegistered_User_Id;
        // </editor-fold>
         
        //<editor-fold defaultstate="collapsed" desc="Notification Status">
         public UserNotification RefferedUser_UserNotification_Id;
         // </editor-fold>
         
    }
}
