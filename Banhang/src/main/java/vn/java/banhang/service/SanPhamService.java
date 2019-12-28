package vn.java.banhang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.java.banhang.repository.SanPhamRepository;

@Service
public class SanPhamService {
	@Autowired
	private SanPhamRepository sanPhamRepository;
	
}
