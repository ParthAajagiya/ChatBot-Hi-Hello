package com.example.testing.Dto;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserPackageDetailsTrain {

	private String fromCity;
	private String yourBudget;
	private String destination;
	private String traveltype;
	private long days;
	private String FromDate;
	private String ToDate;
	private String hotelName;
	private String hotelType;
	private Integer price;
	
	private String trainnumber;
	private String trainname;
	private LocalDateTime trainDeparturetime;
	private LocalDateTime trainArrivaltime;
	private long travelDuration;
	private long trainPrice;
}
