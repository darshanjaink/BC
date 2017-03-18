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
public interface INormalizer {
  
    IEntity Normalize(IDTO DTO);
    IDTO Denormalize(IEntity Entity);
    
    //IDTO CustomeNormalizer(IDTO Entity);
}
