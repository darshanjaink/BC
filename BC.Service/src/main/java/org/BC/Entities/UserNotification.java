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
public class UserNotification {
    
     // <editor-fold defaultstate="collapsed" desc="Common">
    public long Id;
    public String Code;
    public Date CreatedDate;
    public Date TimeStamp;
    public int VersionId;
    //public BOEntities.UserMasterEntity Created_UserMaster_Id;
   // public BOEntities.UserMasterEntity LasUpdated_UserMaster_Id;
    // </editor-fold>
    
    public UserMasterEntity ToUser_UserMasterEntity_Id;
    
    // <editor-fold defaultstate="collapsed" desc="Email">
    public String Email_Subject ;
    public String Email_Body;
    public Date EmailSend_ProcessStartDate;
    public Boolean IsEmailSend;
    public Date Email_SendDate;
    public String Email_Remarks;
    public int EmailSendProcessCount;
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Email">
    public String  SMS ;
    public Date SMS_SendProcessStartDate;
    public Boolean IsSMSSend;
    public Date SMS_SendDate;
    public String  SMS_Remarks;
    public int     SMS_SendProcessCount;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="MobileNotificationMessage">
    public String  MobileNotificationMessage ;
    public Date MobileNotification_SendProcessStartDate;
    public Boolean IsMobileNotificationSend;
    public Date MobileNotification_SendDate;

    public int     MobileNotification_SendProcessCount;
    
    public boolean IsMobileNotificationDelivered ;
    public boolean MobileNotificationDeliveredDate ;
    
    public boolean IsMobileNotificationRead ;
    public boolean IsMobileNotificationReadStatusChangeDate ;
    
    public boolean IsMobileNotificationHide ;
    public boolean IsMobileNotificationHideStatusChangeDate ;
    
    public boolean IsMobileNotificationDisabled ;
    public boolean IsMobileNotificationDisabledStatusChangeDate ;
    
    public String  MobileNotification_Remarks;
    // </editor-fold>
}
