package com.todo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.todo.model.Item;
import com.todo.model.List;
import com.todo.repository.ItemRepository;
import com.todo.repository.ListRepository;

@Service
@Transactional
public class ItemService 
{
	
	private final ItemRepository itemRepository;
	private final ListRepository listRepository;
	
	@Autowired
	public ItemService(ItemRepository itemRepository, ListRepository listRepository)
	{
		this.itemRepository = itemRepository;
		this.listRepository = listRepository;
	}
	
	public void saveItem(Item item)
	{
		try 
		{
			itemRepository.save(item);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setList(Item item, int listID)
	{
		List list = listRepository.findById(listID);
		
		item.setList(list);
	}

}
