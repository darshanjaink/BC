/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Normalizer;

import org.BC.DTO.UserRegisterationDTO;
import org.BC.Entities.UserMasterEntity;
import org.BC.Framework.IDTO;
import org.BC.Framework.IEntity;
import org.BC.Framework.INormalizer;

/**
 *
 * @author gibs
 */
public class UserMasterNormalizer  implements INormalizer{
   
    @Override
    public IEntity Normalize(IDTO DTO) 
    {
        UserRegisterationDTO oUserRegisterationDTO=(UserRegisterationDTO)DTO;
        UserMasterEntity oUserMasterEntity=new UserMasterEntity();
        oUserMasterEntity.setFirstName(oUserRegisterationDTO.getFirstName());
        oUserMasterEntity.setMiddleName(oUserRegisterationDTO.getMiddleName());
        oUserMasterEntity.setLastName(oUserRegisterationDTO.getLastName());
        
        //oUserMasterEntity.setDOB(oUserRegisterationDTO.getDOB());
        oUserMasterEntity.setUserId(oUserRegisterationDTO.getUserId());
        oUserMasterEntity.setPassword(oUserRegisterationDTO.getPassword());
        
        oUserMasterEntity.setEmailID(oUserRegisterationDTO.getEmailID());
        oUserMasterEntity.setPrimMobNumber(oUserRegisterationDTO.getPrimMobNumber());
        oUserMasterEntity.setSecMobNumber(oUserRegisterationDTO.getSecMobNumber());
        oUserMasterEntity.setLandLineNumber(oUserRegisterationDTO.getLandLineNumber());
          
        oUserMasterEntity.setLatitude(oUserRegisterationDTO.getLatitude());
        oUserMasterEntity.setLongitude(oUserRegisterationDTO.getLongitude());
        oUserMasterEntity.setPostalCode(oUserRegisterationDTO.getPostalCode());
            // oUserMasterEntity.setPostalCode(oUserRegisterationDTO.getPostalCode());
          
        return oUserMasterEntity;
    }

    @Override
    public IDTO Denormalize(IEntity Entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
