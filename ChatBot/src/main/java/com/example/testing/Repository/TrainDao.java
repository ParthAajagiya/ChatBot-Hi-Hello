package com.example.testing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.Entity.Trains;

public interface TrainDao extends JpaRepository<Trains, Long> {

}
