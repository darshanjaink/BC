/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BC.DAO;

/**
 *
 * @author gibs
 */

import java.util.List;
import org.BC.Entities.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserMasterDAO implements IUserMasterDAO {
	
        @Autowired
	public SessionFactory sessionFactory;

	public UserMasterDAO() {
		
	}
	
	/*public UserMasterDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	@Override
	@Transactional
	public List<UserMasterEntity> list() {
		@SuppressWarnings("unchecked")
		List<UserMasterEntity> listUser = (List<UserMasterEntity>) sessionFactory.getCurrentSession()
				.createCriteria(UserMasterEntity.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}

	@Override
	//@Transactional
	public void saveOrUpdate(UserMasterEntity user) {
            try{

               Session oSession  =	sessionFactory.openSession();
                oSession.beginTransaction();
                oSession.saveOrUpdate(user);
                 oSession.getTransaction().commit();
            }catch(Exception ex)
            {
             String exce=ex.toString();
            String ddd=exce;
            throw ex;
            }
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
		String hql = "from User where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserMasterEntity> listUser = (List<UserMasterEntity>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		
		return null;
	}
        
        @Override
        public Long UserCountByUserID(String UserID)
        {
           Session session   = sessionFactory.openSession();
         
           org.hibernate.query.Query qry= session.createQuery("select count(Id) from UserMasterEntity um where um.userId = :vuserId").
                   setParameter("vuserId", UserID);
           Long count = (Long) qry.uniqueResult();
           return count;
        }
}