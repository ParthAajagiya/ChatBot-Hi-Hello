package com.example.testing.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Table(name = "packages")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Packages 
{
	@Id
	private Long id;
	private String country;
	private String transportationtype;
	private String city;
	private int totalperson;
	private String fromcity;
	private Long price;
	private LocalDate fromdate;
	private LocalDate todate;
	private Long totaldays;
	@ManyToOne
	private Flights flight;
	@ManyToOne
	private Trains train;
	
	@ManyToOne
	private Bus bus;
	
	@ManyToOne
	private Hotels hotel;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Attractions> attractions;
	
}
