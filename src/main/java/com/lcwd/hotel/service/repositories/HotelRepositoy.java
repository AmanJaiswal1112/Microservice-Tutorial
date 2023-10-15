package com.lcwd.hotel.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lcwd.hotel.service.entity.Hotel;

@Repository
public interface HotelRepositoy extends JpaRepository<Hotel, String> {

}
