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
public class UserPackageDetailsBus {

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
	private String busnumber;
    private String operator;
    private LocalDateTime departuretime;
    private LocalDateTime arrivaltime;
    private long duration;
    private long busPrice;

}
