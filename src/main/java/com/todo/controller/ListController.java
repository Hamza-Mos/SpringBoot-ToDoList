package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.model.Item;
import com.todo.model.List;
import com.todo.services.ItemService;
import com.todo.services.ListService;

@Controller
@RequestMapping(path="/todo") // This means URL's start with /todo (after Application path)
public class ListController 
{
	
	@Autowired
	ListService listService;
	
	@Autowired
	ItemService itemService;
	
//	@RequestMapping(path="/home")
//	public void test()
//	{
//		
//		List list = new List("new test list");
//		
//		listService.saveList(list);
//		
//		Item item = new Item("new test item");
//		
//		itemService.saveItem(item);
//		
//		itemService.setList(item, list.getId());
//		
//		System.out.println("Added list");
//		
//		System.out.println(listService.getItems(list.getId()));
//		
//	}
	
	
	@RequestMapping(path="/lists")
	public String getLists(Model model)
	{
		
		model.addAttribute("lists", listService.getAllLists());
		
		return "Lists";
	}
	
	@RequestMapping(path="/lists/add")
	public String createList()
	{
		return "addList";
	}
	
	@RequestMapping(path="/addList",  method = RequestMethod.POST)
	public String addList(@RequestParam(name = "listname", required = true) String name)
	{
		
		List list = new List(name);
		
		listService.saveList(list);
		
		return "redirect:/todo/lists";
		
	}
	
	@RequestMapping(path="/lists/{id}")
	public String getSpecificList(@PathVariable("id") int listId, Model model)
	{
		List list = listService.getListById(listId);
		
		model.addAttribute("list", list);
		
		model.addAttribute("items", listService.getItems(listId));
		
		return "List";
	}
	
	

}
