package com.example.testing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.Entity.Flights;

public interface FlightsDao extends JpaRepository<Flights, Long> {

}
