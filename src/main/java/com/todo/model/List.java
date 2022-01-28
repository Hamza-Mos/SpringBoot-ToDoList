package com.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.lang.NonNull;

@EnableAutoConfiguration
@Entity // This tells Hibernate to make a table out of this class
@Table(
		name = "tbl_lists",
		uniqueConstraints = @UniqueConstraint(
                name = "name_unique",
                columnNames = "name"
        )
)
public class List 
{
	
	@Id
	@SequenceGenerator(
            name = "list_sequence",
            sequenceName = "list_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "list_sequence"
    )
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;

	public List(String name) 
	{
		super();
		this.name = name;
	}
	
	public List()
	{
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "List [id=" + id + ", name=" + name + "]";
	}
	
}
