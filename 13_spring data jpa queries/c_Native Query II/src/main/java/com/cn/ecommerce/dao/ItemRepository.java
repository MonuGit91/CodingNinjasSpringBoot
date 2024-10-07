package com.cn.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cn.ecommerce.entity.Item;
import org.springframework.data.repository.query.Param;

public interface ItemRepository extends JpaRepository<Item,Integer> {
	
	@Query(value="SELECT * FROM item WHERE description LIKE CONCAT(?1,'%') LIMIT 4",nativeQuery=true)
	List<Item> getItemByDesc(@Param("desc") String desc);
}
