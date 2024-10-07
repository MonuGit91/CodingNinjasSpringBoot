package com.cn.cnkart.dal;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.cnkart.entity.Item;

@Repository
public class ItemDALImpl implements ItemDAL{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public Item getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Item.class, id);
	}

	@Override
	public void save(Item item) {

	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public void update(Item updateItem) {

	}

}
