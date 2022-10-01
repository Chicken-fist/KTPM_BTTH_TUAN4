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

	// Cau 14
	@GetMapping("/getChuyenBayBoiMayBayA320")
	public List<ChuyenBay> getChuyenBayBoiMayBayA320() {

		return chuyenBayRepository.findChuyenBayBoiMayBayA320();
	}

	// Cau 17
	@GetMapping("/getDuongBayDiThang")
	public List<ChuyenBay> getDuongBayDiThang() {

		return chuyenBayRepository.findDuongBayDiThang();
	}

	// Cau 18
	@GetMapping("/getChuyenBayTuMoiGa")
	public List<Object> getChuyenBayTuMoiGa() {

		return chuyenBayRepository.findChuyenBayTuMoiGa();
	}

	// Cau 19
	@GetMapping("/getChiPhiChuyenBayMoiGa")
	public List<Object> getChiPhiChuyenBayMoiGa() {

		return chuyenBayRepository.findChiPhiChuyenBayMoiGa();
	}

	// Cau 20
	@GetMapping("/getChuyenBayKhoiHanhTruoc12h")
	public List<ChuyenBay> getChuyenBayKhoiHanhTruoc12h() {

		return chuyenBayRepository.findChuyenBayKhoiHanhTruoc12h();
	}

}
