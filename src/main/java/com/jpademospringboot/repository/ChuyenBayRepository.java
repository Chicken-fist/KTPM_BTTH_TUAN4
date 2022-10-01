package com.jpademospringboot.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpademospringboot.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	
	List<ChuyenBay> findChuyenBayByGaDen(String gaden);
	
	@Query(value = "select * from chuyenbay where DoDai < 10000 and DoDai > 8000", nativeQuery = true)
	List<ChuyenBay> findChuyenBayCoDoDaiLonHon10000VaBeHon8000();
	
	@Query(value = "select * from chuyenbay where GaDi = 'SGN' and GaDen = 'BMV'", nativeQuery = true)
	List<ChuyenBay> findChuyenBayTuSGDiBMT();
	
	@Query(value = "select * from chuyenbay where GaDi = 'SGN' ", nativeQuery = true)
	List<ChuyenBay> findChuyenBayTuSG();
	
	//Cau 14
	@Query(value = " select * from chuyenbay "
			+ " where dodai < (select tambay from maybay "
			+ " where Loai like '%Airbus A320%') ", nativeQuery = true)
	List<ChuyenBay> findChuyenBayBoiMayBayA320();
}
