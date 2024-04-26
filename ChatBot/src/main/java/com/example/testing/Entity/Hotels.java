package com.example.testing.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "hotels")
@Data
public class Hotels {
	@Id
	private Long id;
	@Column(unique = true)
	private String name;
	private String type;
	private Integer price;
	@ManyToOne
	private City city;
	
}
