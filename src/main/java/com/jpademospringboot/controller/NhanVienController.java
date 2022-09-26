package com.jpademospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpademospringboot.entity.NhanVien;
import com.jpademospringboot.repository.NhanVienRepository;

@RestController
@RequestMapping("/nhan-vien")
public class NhanVienController {
	
	@Autowired
	NhanVienRepository nhanVienRepository;
	
	@GetMapping("/getLuongDuoiChiDinh")
	public List<NhanVien> getNhanVienLuongDuoiChiDinh(){
		
		return nhanVienRepository.findNhanVienCoLuongDuoiLuongChiDinh();
	}

}
