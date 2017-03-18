/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Entities;

import java.util.Date;


/**
 *
 * @author gibs
 */

public class UserDetais{




public class AddressEntity
{
    // <editor-fold defaultstate="collapsed" desc="Common">
     public long Id;
     public String Code;
     public Date CreatedDate;
     public Date TimeStamp;
     public int VersionId;
    // </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="Info">
    public String Line;
    public CountryMasterEntity Country;
    public StateMasterEntity State;
    public CityMasterEntity City;
    public String Zip;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Geo">
    public double  Latitude;
    public double  Longitude;
   // public String Location;
    // </editor-fold>
}
public class CountryMasterEntity 
{
    // <editor-fold defaultstate="collapsed" desc="Common">
     public long Id;
     public String Code;
     public Date CreatedDate;
     public Date TimeStamp;
     public int VersionId;
    // </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="Info">
    public String Name;
    // </editor-fold>
}
public class CityMasterEntity
{
    // <editor-fold defaultstate="collapsed" desc="Common">
     public long Id;
     public String Code;
     public Date CreatedDate;
     public Date TimeStamp;
     public int VersionId;
    // </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="Info">
    public String Name;
    // </editor-fold>
}
public class StateMasterEntity
{
    // <editor-fold defaultstate="collapsed" desc="Common">
     public long Id;
     public String Code;
     public Date CreatedDate;
     public Date TimeStamp;
     public int VersionId;
    // </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="Info">
    public String Name;
    // </editor-fold>
}

}