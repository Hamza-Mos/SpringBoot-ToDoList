package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.todo.model.Item;
import com.todo.services.ItemService;

@Controller
@RequestMapping(path="/todo") // This means URL's start with /todo (after Application path)
public class ItemController 
{
	@Autowired
	private ItemService itemService;
	
//	@RequestMapping(path="/initial")
//	public String welcome()
//	{
//		return "AddItem";
//	}
//	
//	@RequestMapping(path = "/add/:listId", method = RequestMethod.POST)
//	public String addNewItem(@RequestParam (name = "itemname", required = false, defaultValue="unknown") String name, @SessionAttribute()) 
//	{
//	    // @ResponseBody means the returned String is the response, not a view name
//	    // @RequestParam means it is a parameter from the GET or POST request
//
//		Item item = new Item(name);
//	    System.out.println("entered method");
//	    itemService.saveItem(item);
//	    System.out.println("added item");
//	    return "ItemAdded";
//	 }
	
	

}
