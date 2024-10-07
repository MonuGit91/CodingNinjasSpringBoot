package com.cn.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cn.ecommerce.entity.ItemDetails;
import org.springframework.data.jpa.repository.Query;

public interface ItemDetailsRepository extends JpaRepository<ItemDetails,Integer> {
	
	//derived query
	List<ItemDetails> findByPriceGreaterThan(double price);

}