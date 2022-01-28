package com.todo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.model.Item;
import com.todo.model.List;
import com.todo.repository.ItemRepository;
import com.todo.repository.ListRepository;

@Service
@Transactional
public class ListService 
{
	
	private final ListRepository listRepository;
	private final ItemRepository itemRepository;
	
	@Autowired
	public ListService(ListRepository listRepository, ItemRepository itemRepository)
	{
		this.listRepository = listRepository;
		this.itemRepository = itemRepository;
	}
	
	public void saveList(List list)
	{
		try 
		{
			listRepository.save(list);
		} 
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public java.util.List <Item> getItems(int id)
	{
		return itemRepository.findByListID(id);
	}
	
	public java.util.List<List> getAllLists()
	{
		return listRepository.findAll();
	}
	
	public List getListById(int id)
	{
		return listRepository.getById(id);
	}

}
