package com.cn.cnkart.dal;

import org.springframework.data.repository.CrudRepository;
import com.cn.cnkart.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {//Integer -> datatype of id(unique id) of our table

}
