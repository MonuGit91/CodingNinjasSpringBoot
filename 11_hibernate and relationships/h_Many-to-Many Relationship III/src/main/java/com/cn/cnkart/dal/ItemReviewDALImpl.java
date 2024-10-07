package com.cn.cnkart.dal;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.cnkart.entity.ItemReview;

@Repository
public class ItemReviewDALImpl implements ItemReviewDAL{


	@Autowired
	EntityManager entityManager;
	
	@Override
	public void save(ItemReview review) {
		Session session = entityManager.unwrap(Session.class);
		session.save(review);
	}

}
