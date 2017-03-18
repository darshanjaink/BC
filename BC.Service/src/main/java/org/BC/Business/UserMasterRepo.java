/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.Business;


import java.util.List;
import org.BC.DAO.*;
import org.BC.Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author gibs
 */
@Repository
public class UserMasterRepo implements IUserMasterRepo {
	
        @Autowired
	private IUserMasterDAO oUserMasterDAO;

	public UserMasterRepo() {
		
	}

	@Override
	@Transactional
	public List<UserMasterEntity> list() {
		@SuppressWarnings("unchecked")
		List<UserMasterEntity> listUser = oUserMasterDAO.list();
		return listUser;
	}

        
        @Override
	@Transactional
	public void saveOrUpdateNew(UserMasterEntity user) {
            oUserMasterDAO.saveOrUpdate(user);

        }
	@Override
	@Transactional
	public void saveOrUpdate(UserMasterEntity user) {
           oUserMasterDAO.saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void delete(int id) {
		//UserMasterEntity userToDelete = new UserMasterEntity();
		//userToDelete.setId(id);
		//sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
	@Transactional
	public UserMasterEntity get(int id) {
		oUserMasterDAO.get(id);
		return null;
	}
}