package com.jpademospringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpademospringboot.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String>{
	
	@Query(value = "select * from nhanvien where Luong < 10000", nativeQuery = true)
	List<NhanVien> findNhanVienCoLuongDuoiLuongChiDinh();
	
	@Query(value = "select sum(luong) from nhanvien", nativeQuery = true)
	Integer getTongSoLuongTraNhanVien();
	
	@Query(value = " select distinct n.MaNV, Ten, Luong from nhanvien n join chungnhan c on n.MaNV = c.MaNV join maybay m "
			+ " on c.MaMB = m.MaMB where m.Loai like 'Boeing%' ", nativeQuery = true)
	List<NhanVien> findNhanVienLaiMayBayBoeing();
	
	@Query(value = " select distinct n.MaNV, Ten, Luong from nhanvien n join chungnhan c on n.MaNV = c.MaNV join maybay m "
			+ " on c.MaMB = m.MaMB where m.Loai like '%747%' ", nativeQuery = true)
	List<NhanVien> findNhanVienLaiMayBay747();
	
	//Cau 12
	@Query(value = "select distinct nv.MaNV, nv.Ten, nv.Luong from nhanVien "
			+ " nv join chungnhan vn on nv.MaNV = vn.MaNV "
			+ "	join MayBay m on vn.MaMB = m.MaMB where loai like '%airbus%' and nv.MaNV in "
			+ " (select nv.MaNV from nhanVien nv join chungnhan vn on nv.MaNV = vn.MaNV  "
			+ "	join MayBay m on vn.MaMB = m.MaMB where loai like '%boeing%')", 
			nativeQuery = true)
	List<NhanVien> findNVCoTheLaiBoingNAirbus();
	
	//Cau 15
	@Query(value = "select distinct nv.Ten from nhanVien nv join chungnhan vn on nv.MaNV = vn.MaNV join MayBay m on vn.MaMB = m.MaMB where Loai like '%boeing%' ", nativeQuery = true)
	List<String> findTenPCLaiBoeing();

}
