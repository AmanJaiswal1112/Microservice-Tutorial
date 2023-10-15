package com.lcwd.hotel.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.service.entity.Hotel;
import com.lcwd.hotel.service.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping("")
	public ResponseEntity<Hotel> create(@RequestBody Hotel hotel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAll());
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getById(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getById(hotelId)) ;
				
	}
	
}
