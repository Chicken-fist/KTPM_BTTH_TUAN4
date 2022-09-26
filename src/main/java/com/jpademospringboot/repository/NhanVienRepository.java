package com.jpademospringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpademospringboot.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String>{
	
	@Query(value = "select * from nhanvien where Luong < 10000", nativeQuery = true)
	List<NhanVien> findNhanVienCoLuongDuoiLuongChiDinh();

}
