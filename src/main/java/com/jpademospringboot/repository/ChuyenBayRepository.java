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
}
