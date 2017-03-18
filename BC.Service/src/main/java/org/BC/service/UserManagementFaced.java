/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.service;


import java.util.Set;
import org.BC.DTO.*;
import org.BC.Entities.*;
import org.BC.Business.*;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.BC.Framework.*;
/**
 *
 * @author gibs
 */

//
@Controller
public class UserManagementFaced {
    
    private static final Logger logger = Logger.getLogger(UserManagementFaced.class);
    /**
     * @author gibs
     * 
     * User registration API
     * 
     * @param oUserRegisterationDTO : User registration info
     * @return 
     * @throws 
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody UserRegisterationResponseDTO Register (@RequestBody UserRegisterationDTO  oUserRegisterationDTO) {
        
         UserRegisterationResponseDTO oUserRegisterationResponseDTO=new UserRegisterationResponseDTO();
        try{ 
        APLog.Debug("UserManagementFaced.Register() Start",logger);      
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        
        //PostValidation
        IValidation UserValidation=(IValidation)context.getBean("UserDuplicatValidationReff");
        UserValidation.PreValidation(oUserRegisterationDTO);
       
        //Normalize the request
        INormalizer oNormalizer=(INormalizer)context.getBean("UserMasterNormalizerReff");
        UserMasterEntity oUserMasterEntity=(UserMasterEntity)oNormalizer.Normalize(oUserRegisterationDTO);
  
        //PostValidation
        //IValidation UserValidation=(IValidation)context.getBean("UserDuplicatValidationReff");
       // UserValidation.PostValidation(oUserMasterEntity);
        
        
        //Save the request
        IUserMasterRepo oUserMasterRepo=(IUserMasterRepo)context.getBean("UserMasterRepoReff");
        oUserMasterRepo.saveOrUpdate(oUserMasterEntity);
        
        oUserRegisterationResponseDTO.UserID=oUserMasterEntity.getEmailID();
        APLog.Debug("UserManagementFaced.Register() Finished",logger);
         
       
        }
        catch(APDefaultBusinessException ex)
        {
          oUserRegisterationResponseDTO.SetErrorMessage(ex.BusinessException);
        }
        catch(Exception ex)
        {
           oUserRegisterationResponseDTO.SetErrorMessage(APErrors.UNKNOWNEXCEPTION);
           oUserRegisterationResponseDTO.InternalMessage =ex.toString();
           APLog.Error("UserManagementFaced.Register() ,Exception : " ,ex,logger);  
        }
        return oUserRegisterationResponseDTO;
    }
    
   
    

}
