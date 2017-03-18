/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.DAO;

import java.util.List;
import org.BC.Entities.*;


/**
 *
 * @author gibs
 */
public interface IUserMasterDAO {
    	
        public List<UserMasterEntity> list();
	
	public UserMasterEntity get(int id);
	
	public void saveOrUpdate(UserMasterEntity user);
	
	public void delete(int id);
        
        public Long UserCountByUserID(String UserID);
}
