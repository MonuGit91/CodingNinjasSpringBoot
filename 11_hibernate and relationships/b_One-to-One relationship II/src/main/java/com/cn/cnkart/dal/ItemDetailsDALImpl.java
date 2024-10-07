package com.cn.cnkart.dal;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.cnkart.entity.ItemDetails;

@Repository
public class ItemDetailsDALImpl implements ItemDetailsDAL{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public void delete(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		ItemDetails itemDetails = session.get(ItemDetails.class, id);
		session.delete(itemDetails);
	}
}
