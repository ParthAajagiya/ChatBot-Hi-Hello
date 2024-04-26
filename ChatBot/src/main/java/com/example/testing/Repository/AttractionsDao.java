package com.example.testing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.Entity.Attractions;

public interface AttractionsDao extends JpaRepository<Attractions, Long> {

}
