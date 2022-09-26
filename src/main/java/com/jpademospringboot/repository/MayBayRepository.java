package com.jpademospringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpademospringboot.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
	
	@Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
	List<MayBay> getMayBayByTamBay();
	
	

}
