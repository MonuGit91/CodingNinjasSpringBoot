package com.cn.cnkart.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cnkart.dal.ItemReviewDAL;
import com.cn.cnkart.entity.ItemReview;

@Service
public class ItemReviewService {

	@Autowired
	ItemReviewDAL itemReviewDAL;
	
	@Transactional
	public void save(ItemReview review) {
		itemReviewDAL.save(review);
		
	}


}
