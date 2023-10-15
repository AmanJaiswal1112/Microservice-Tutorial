package com.lcwd.hotel.service.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.service.entity.Hotel;
import com.lcwd.hotel.service.exception.ResourceNotFoundException;
import com.lcwd.hotel.service.repositories.HotelRepositoy;

@Service
public class HotelService {

	@Autowired
	private HotelRepositoy hotelRepositoy;
	
	
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepositoy.save(hotel);
	}
	
	public List<Hotel> getAll(){
		return hotelRepositoy.findAll();
	}
	
	
	public Hotel getById(String hotelId){
		return hotelRepositoy.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel given id not found"));
	}
}
