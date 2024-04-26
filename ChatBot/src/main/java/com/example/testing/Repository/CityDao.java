package com.example.testing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.Entity.City;

public interface CityDao extends JpaRepository<City, Long> {

}
