/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Framework;

/**
 *
 * @author gibs
 */
public class APDefaultBusinessException extends Exception {
    
   public APErrors BusinessException;
    public APDefaultBusinessException (APErrors _Error)
    {
        BusinessException=_Error;
    }
    //public String Message;
}
