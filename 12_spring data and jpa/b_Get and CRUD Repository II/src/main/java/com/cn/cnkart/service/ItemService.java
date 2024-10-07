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
		return itemRepository.findById(id).get();
	}

	
	public void saveItem(Item item) {

	}

	public void delete(int id) {

	}

	public void update(Item updateItem) {

	}

	public List<Item> getItem() {
		List<Item> itemList = new ArrayList<>();
		itemRepository.findAll().forEach(itemList::add);//.forEach(item -> itemList.add(item));
		return itemList;
	}
	
}