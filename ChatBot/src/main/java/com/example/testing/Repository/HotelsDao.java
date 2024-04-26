package com.example.testing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.Entity.Hotels;

public interface HotelsDao extends JpaRepository<Hotels, Long> {

}
