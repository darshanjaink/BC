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
public interface IValidation  {
    
    public void PreValidation(IDTO Request) throws APDefaultBusinessException;
    public void PostValidation(IEntity Request) throws APDefaultBusinessException;
            
}
