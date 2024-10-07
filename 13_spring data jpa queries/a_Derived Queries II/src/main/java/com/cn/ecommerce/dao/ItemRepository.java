package com.cn.ecommerce.dao;
import com.cn.ecommerce.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Integer> {

}
