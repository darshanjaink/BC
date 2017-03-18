/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Framework;

import org.BC.service.UserManagementFaced;
import org.apache.log4j.Logger;

/**
 *
 * @author gibs
 */
public class APLog {
    
   // private static final Logger logger  = Logger.getLogger(UserManagementFaced.class);
    public static void Debug(Object msg,Logger logger)
    {
        logger.debug(msg);
    }
    
    public static void Error(String msg,Exception ex,Logger logger)
    {
          logger.error(msg ,ex);  
    }
}
