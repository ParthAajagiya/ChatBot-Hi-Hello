package com.example.testing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.Entity.Bus;


public interface BusDao extends JpaRepository<Bus, Long> 
{

}
