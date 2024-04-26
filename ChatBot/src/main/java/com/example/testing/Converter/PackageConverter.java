package com.example.testing.Converter;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.testing.Dto.UserPackageDetails;
import com.example.testing.Dto.UserPackageDetailsBus;
import com.example.testing.Dto.UserPackageDetailsTrain;
import com.example.testing.Entity.Bus;
import com.example.testing.Entity.Flights;
import com.example.testing.Entity.Hotels;
import com.example.testing.Entity.Packages;
import com.example.testing.Entity.Trains;
import com.example.testing.Repository.AttractionsDao;
import com.example.testing.Repository.BusDao;
import com.example.testing.Repository.CityDao;
import com.example.testing.Repository.FlightsDao;
import com.example.testing.Repository.HotelsDao;
import com.example.testing.Repository.PackagesDao;
import com.example.testing.Repository.TrainDao;

@Component
public class PackageConverter 
{
	@Autowired
	private BusDao busDao;
	
	@Autowired
	private CityDao cityDao;
	
	@Autowired
	private FlightsDao flightDao;
	
	@Autowired
	private HotelsDao hotelDao;
	
	@Autowired
	private PackagesDao packageDao;
	
	@Autowired
	private TrainDao trainDao;
	
	@Autowired
	private AttractionsDao attractionDao;
	
	public Object entityToDto(Packages packages)
	{
		if(packages.getFlight()!=null)
		{
			UserPackageDetails details= new UserPackageDetails();
			
			details.setFromCity(packages.getFromcity());
			details.setDestination(packages.getCity());
			Flights flights = flightDao.findById(packages.getFlight().getId()).get();
			
			details.setAirline(flights.getAirline());
			details.setFlightnumber(flights.getFlightnumber());
			details.setFlightPrice( flights.getPrice());
			details.setArrivaltime(flights.getArrivaltime());
			details.setDeparturetime(flights.getDeparturetime());
			details.setDuration(flights.getDuration().getNano()/3600);
			
			Hotels hotels = hotelDao.findById(packages.getHotel().getId()).get();
			
			details.setPrice(hotels.getPrice());
			details.setHotelName(hotels.getName());
			details.setHotelType(hotels.getType());
			
			details.setFromDate(String.valueOf(packages.getFromdate()) );
			details.setToDate(String.valueOf(packages.getTodate()));
			details.setTraveltype(packages.getTransportationtype());
			details.setDays(packages.getTotaldays());
			Long budget=flights.getPrice()+packages.getPrice()+hotels.getPrice();
			details.setYourBudget(String.valueOf(budget));
		
			return details;
		}
		if(packages.getBus()!=null)
		{
			UserPackageDetailsBus details= new UserPackageDetailsBus();
			details.setFromCity(packages.getFromcity());
			details.setDestination(packages.getCity());
			
			Bus bus = busDao.findById(packages.getBus().getId()).get();
			details.setBusnumber(bus.getBusnumber());
			details.setBusPrice(bus.getPrice());
			details.setArrivaltime(bus.getArrivaltime());
			details.setDeparturetime(bus.getDeparturetime());
			details.setDuration(bus.getDuration().getNano()/3600);
			
			Hotels hotels = hotelDao.findById(packages.getHotel().getId()).get();
			
			details.setPrice(hotels.getPrice());
			details.setHotelName(hotels.getName());
			details.setHotelType(hotels.getType());
			
			details.setFromDate(String.valueOf(packages.getFromdate()) );
			details.setToDate(String.valueOf(packages.getTodate()));
			details.setTraveltype(packages.getTransportationtype());
			details.setDays(packages.getTotaldays());
			Long budget=bus.getPrice()+packages.getPrice()+hotels.getPrice();
			details.setYourBudget(String.valueOf(budget));
			
			return details;
		}
		if(packages.getTrain()!=null)
		{

			UserPackageDetailsTrain details= new UserPackageDetailsTrain();
			details.setFromCity(packages.getFromcity());
			details.setDestination(packages.getCity());
			
			Trains trains = trainDao.findById(packages.getTrain().getId()).get();
			details.setTrainArrivaltime(trains.getArrivaltime());
			details.setTrainDeparturetime(trains.getDeparturetime());
			details.setTrainname(trains.getTrainname());
			details.setTrainnumber(trains.getTrainnumber());
			details.setTrainPrice(trains.getPrice());
			details.setTravelDuration(trains.getDuration().getNano()/3600);
			
			Hotels hotels = hotelDao.findById(packages.getHotel().getId()).get();
			
			details.setPrice(hotels.getPrice());
			details.setHotelName(hotels.getName());
			details.setHotelType(hotels.getType());
			
			details.setFromDate(String.valueOf(packages.getFromdate()) );
			details.setToDate(String.valueOf(packages.getTodate()));
			details.setTraveltype(packages.getTransportationtype());
			details.setDays(packages.getTotaldays());
			Long budget= trains.getPrice()+packages.getPrice()+hotels.getPrice();
			details.setYourBudget(String.valueOf(budget));
			
			return details;

		}
		return null;
	}
}
