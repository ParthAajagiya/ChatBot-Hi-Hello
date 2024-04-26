package com.example.testing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testing.Entity.Packages;
@Repository
public interface PackagesDao extends JpaRepository<Packages, Long> 
{

}
