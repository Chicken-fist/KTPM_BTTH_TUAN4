package com.jpademospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpademospringboot.entity.ChuyenBay;
import com.jpademospringboot.repository.ChuyenBayRepository;

@RequestMapping("/chuyen-bay")
@RestController
public class ChuyenBayController {

	@Autowired
	ChuyenBayRepository chuyenBayRepository;

	@GetMapping("/diem-den-Da-Lat")
	public List<ChuyenBay> getDiemDenDaLat() {

		return chuyenBayRepository.findChuyenBayByGaDen("DAD");
	}

	@GetMapping("/doDaiLonHon10000VaBeHon8000")
	public List<ChuyenBay> getChuyenBayCoDoDaiLonHon10000VaBeHon8000() {

		return chuyenBayRepository.findChuyenBayCoDoDaiLonHon10000VaBeHon8000();
	}

	@GetMapping("/saigon-buonmethuoc")
	public List<ChuyenBay> getChuyenBayTuSGDiBMT() {

		return chuyenBayRepository.findChuyenBayTuSGDiBMT();
	}
	
	@GetMapping("/xuatphatTuSaiGon")
	public List<ChuyenBay> getChuyenBayxuatphatTuSaiGon() {

		return chuyenBayRepository.findChuyenBayTuSG();
	}
	
	//Cau 14
	@GetMapping("/getChuyenBayBoiMayBayA320")
	public List<ChuyenBay> getChuyenBayBoiMayBayA320() {

		return chuyenBayRepository.findChuyenBayBoiMayBayA320();
	}

}
