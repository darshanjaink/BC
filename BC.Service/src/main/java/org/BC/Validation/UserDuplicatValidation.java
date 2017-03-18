/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Validation;

import org.BC.DAO.IUserMasterDAO;
import org.BC.DTO.UserRegisterationDTO;
import org.BC.Framework.APDefaultBusinessException;
import org.BC.Framework.APErrors;
import org.BC.Framework.IDTO;
import org.BC.Framework.IEntity;
import org.BC.Framework.IValidation;
import org.BC.service.UserManagementFaced;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author gibs
 */
public class UserDuplicatValidation  implements IValidation {

    
     
    @Autowired
    private IUserMasterDAO oUserMasterDAO;
    
    @Override
    public void PreValidation(IDTO Request) throws APDefaultBusinessException {
        
        UserRegisterationDTO oUserRegisterationDTO=(UserRegisterationDTO)Request;
        if(oUserMasterDAO.UserCountByUserID(oUserRegisterationDTO.UserId)>0)
          throw new APDefaultBusinessException(APErrors.DUPLICATE_USER);
    }
    

    @Override
    public void PostValidation(IEntity Request) throws APDefaultBusinessException {
         // throw new APDefaultBusinessException(APErrors.DUPLICATE_USER);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
