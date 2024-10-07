package com.cn.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cn.ecommerce.entity.ItemDetails;
import org.springframework.data.jpa.repository.Query;

public interface ItemDetailsRepository extends JpaRepository<ItemDetails,Integer> {
	
	//derived query
	List<ItemDetails> findByPriceGreaterThan(double price);

	//JPQL
	@Query("Select itd from ItemDetails itd where itd.category=?1 ORDER BY itd.price DESC")
	List<ItemDetails> findByCategoryOrderByPrice(String category);
}