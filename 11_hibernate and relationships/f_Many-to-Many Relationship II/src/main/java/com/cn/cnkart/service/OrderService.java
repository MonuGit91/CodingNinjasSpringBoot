package com.cn.cnkart.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cnkart.dal.ItemDAL;
import com.cn.cnkart.dal.OrderDAL;
import com.cn.cnkart.entity.Item;
import com.cn.cnkart.entity.Order;

@Service
public class OrderService {

	@Autowired
	OrderDAL orderDAL;

	public Order getOrderById(int id) {
		
		return orderDAL.getOrderById(id);
	}


	public void saveOrder(Order order) {

	}


	public void delete(int id) {
		orderDAL.delete(id);
		
	}

}
