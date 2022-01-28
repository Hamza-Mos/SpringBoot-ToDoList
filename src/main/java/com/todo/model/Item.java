package com.todo.model;

import java.sql.Date;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.lang.NonNull;

@EnableAutoConfiguration
@Entity // This tells Hibernate to make a table out of this class
@Table(
		name = "tbl_items",
        uniqueConstraints = @UniqueConstraint(
                name = "item_name_unique",
                columnNames = "item_name"
        )
)
public class Item 
{
	
	@Id
	@SequenceGenerator
	(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue
    (
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )
	@Column(name = "id")
	private Integer id;
	
	@Column(
			name = "item_name",
			nullable = false
	)
	private String itemName;
	
	@Column(name = "last_updated_time")
	private Date lastUpdatedTime;
	
	@ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "list_id",
            referencedColumnName = "id"
    )
	private List list;
	
	public Item(String itemName) 
	{
		super();
		this.itemName = itemName;
		java.util.Date now = new java.util.Date();
		this.lastUpdatedTime = new Date(now.getTime());
		
	}

	public List getList() {
		return list;
	}

	public void setList(List list) 
	{
		this.list = list;
	}

	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public String getItemName() 
	{
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", lastUpdatedTime=" + lastUpdatedTime + ", list=" + list
				+ "]";
	}
	
	
	
}
