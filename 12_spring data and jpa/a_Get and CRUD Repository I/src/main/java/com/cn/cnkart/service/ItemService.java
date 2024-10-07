package com.cn.cnkart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cnkart.dal.ItemRepository;
import com.cn.cnkart.entity.Item;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	public Item getItemById(int id) {
		return itemRepository.findById(id).get();// .get() to convert Optional type to Item type
	}

	
	public void saveItem(Item item) {

	}

	public void delete(int id) {

	}

	public void update(Item updateItem) {

	}
	
}