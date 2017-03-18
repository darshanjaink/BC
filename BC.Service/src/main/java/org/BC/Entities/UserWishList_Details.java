/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Entities;

import org.BC.Entities.UserMasterEntity;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gibs
 */
public class UserWishList_Details
{
public class UserWishList {
   
    // <editor-fold defaultstate="collapsed" desc="Common">
    public long Id;
    public String Code;
    public Date CreatedDate;
    public Date TimeStamp;
    public int VersionId;
    public UserMasterEntity Created_UserMaster_Id;
    public UserMasterEntity LasUpdated_UserMaster_Id;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Core Mapping">    
    public UserMasterEntity UserMaster_Id;
    public Book.BookMaster BookMaster_Id;
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Status">

    public boolean IsBookAvailable;

    public boolean IsBookBought;
    public Date IsBookBoughtStatusChangeDate;
     
    //Not this field not required , in future if its required for any survey can use this
    public boolean IsBookBoughtFromBC;
    public Date    IsBookBoughtFromBCStatusChangeDate;
    
    public boolean IsDisable;
    public Date IsDisableStatusChangeDate;
    
    public boolean IsHide;
    public Date IsHideStatusChangeDate;
    
    public String Remarks;
    
    public List<UserWishListStatus> UserWishListStatusLst;
    // </editor-fold>
    
    
}
public class UserWishListStatus {
    
    // <editor-fold defaultstate="collapsed" desc="Common">
    public long Id;
    public String Code;
    public Date CreatedDate;
    public Date TimeStamp;
    // </editor-fold>
     
    public UserWishList UserWishList_Id;
    
    //Book availble from whome
    public UserLibrary Avaibale_UserLibrary_Id;

    //Available notification status
    public UserNotification UserNotification_ID;

}

}