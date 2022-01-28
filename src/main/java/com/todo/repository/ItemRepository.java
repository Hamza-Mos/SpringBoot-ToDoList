package com.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.todo.model.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> 
{
	
	@Query
	(
			value = "SELECT tbl_items.* FROM tbl_items INNER JOIN tbl_lists ON tbl_items.list_id = tbl_lists.id WHERE tbl_items.list_id = ?1",
			nativeQuery = true
	)
	List <Item> findByListID(int id);

}
