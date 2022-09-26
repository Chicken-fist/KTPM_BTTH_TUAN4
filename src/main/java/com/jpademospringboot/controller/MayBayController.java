package com.jpademospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpademospringboot.entity.MayBay;
import com.jpademospringboot.repository.MayBayRepository;

@RestController
@RequestMapping("/may-bay")
public class MayBayController {

	@Autowired
	MayBayRepository mayBayRepository;

	@GetMapping("/tamBayTren10000")
	public List<MayBay> getMayBayTheoTamBay() {
		return mayBayRepository.getMayBayByTamBay();
	}

}
