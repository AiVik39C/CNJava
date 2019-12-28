package vn.java.banhang.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import vn.java.banhang.exception.ResourceNotFoundException;
import vn.java.banhang.model.Loai;
import vn.java.banhang.service.LoaiService;

public class LoaiController {

	@Autowired
	private LoaiService loaiService;

	@GetMapping("/loai")
	public String getListLoai() {
		List<Loai> listloai = loaiService.findAll();
		return "";
			
	}

	@PostMapping(path = "/loai")
	public String createloai(@RequestBody Loai request) throws Exception {	
		boolean check = loaiService.validateLoai(Long.parseLong("0"), request);
		Loai createLoai = loaiService.createLoai(request);
		return "";
			
	}

	@PutMapping(path = "/loai/{id}")
	public String updateloai(@PathVariable(value = "id") Long id, @RequestBody Loai request) throws Exception {
		
				Loai loai = loaiService.findLoaiById(id).orElseThrow(() -> new ResourceNotFoundException("Loai", "id", id));
				Loai updateLoai = loaiService.updateLoai(id, request);
				return "";
			
	}

	@GetMapping("/loai/{id}")
	public String getDetailloai(@PathVariable(value = "id") Long id) throws Exception {
		Loai loai = loaiService.findLoaiById(id).orElseThrow(() -> new ResourceNotFoundException("Loai", "id", id));
		return "";
			
	}

	@DeleteMapping("/loai/{id}")
	public String deleteloai(@PathVariable(value = "id") Long id) {
		Loai loai = loaiService.findLoaiById(id).orElseThrow(() -> new ResourceNotFoundException("loai", "id", id));
		loaiService.deleteLoai(loai);
		return "";
	}
}