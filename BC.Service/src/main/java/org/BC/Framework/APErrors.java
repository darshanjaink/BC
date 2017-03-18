/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Framework;

/**
 * * @author gibs
 * 
 * Last Error code 1:
 */
public enum APErrors {
  
  // <editor-fold defaultstate="collapsed" desc="Common Error code">
    UNKNOWNEXCEPTION(0, "UNKNOWNEXCEPTION"),
    DATABASE(1, "DATABASE_ERROR"),
  // </editor-fold>
  
  // <editor-fold defaultstate="collapsed" desc="Business Error code">
   DUPLICATE_USER(1, "DUPLICATE_USER"),
   WRONG_DATE_FORMAT(2, "WRONG_DATE_FORMAT"),
   WRONG_EMAILID_FORMAT(2, "WRONG_EMAILID_FORMAT");
  // </editor-fold>  
  
  // <editor-fold defaultstate="collapsed" desc="Common">
  private final int code;
  private final String description;

  private APErrors(int code, String description) {
    this.code = code;
    this.description = description;
  }

  public String getDescription() {
     return description;
  }

  public int getCode() {
     return code;
  }

  @Override
  public String toString() {
    return code + ": " + description;
  }
  // </editor-fold> 
}