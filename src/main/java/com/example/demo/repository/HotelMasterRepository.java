package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.HotelMaster;

public interface HotelMasterRepository extends JpaRepository<HotelMaster, Long> {

}
