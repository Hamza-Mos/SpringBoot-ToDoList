package com.todo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.model.List;

public interface ListRepository extends JpaRepository<List, Integer>
{
	
	List findByName(String name);
	
	List findById(int id);
	
}
