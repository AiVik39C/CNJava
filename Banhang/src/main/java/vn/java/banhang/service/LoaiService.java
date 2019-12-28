package vn.java.banhang.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.java.banhang.model.Loai;
import vn.java.banhang.repository.LoaiRepository;

@Service
public class LoaiService {

	@Autowired
	private LoaiRepository loaiRepository;

	public Loai saveLoai(Loai request) {
		return loaiRepository.save(request);
		
	}

	public List<Loai> findAll() {
		return loaiRepository.findAll();
	}

	public boolean validateLoai(Long id, Loai request) {
		if (id == 0) {
			return loaiRepository.existsByTenLoaiAndMoTa(request.getTenLoai(), request.getMoTa());
		} else {
			return loaiRepository.existsByIdNotAndTenLoai(id, request.getTenLoai());
		}
	}

	public Optional<Loai> findLoaiById(Long id) {
		Loai loai = loaiRepository.findById(id).orElse(null);
		if (loai == null) {
			return Optional.empty();
		}
		return Optional.ofNullable(loai);
	}

	public Loai save(Loai Loai) {
		return loaiRepository.save(Loai);
	}

	public void deleteLoai(Loai loai) {
		loaiRepository.delete(loai);
	}
	
	public Loai createLoai(Loai loaiRequest) {
		Loai createLoai = saveLoai(loaiRequest);
		return createLoai;
	}
	
	public Loai updateLoai(Long id, Loai loaiRequest) {
		Loai loai = findLoaiById(id).orElse(null);
		if (loai != null) {
			loai.setMoTa(loaiRequest.getMoTa());
			loai.setTenLoai(loaiRequest.getTenLoai());
			final Loai updateLoai = saveLoai(loai);
			return updateLoai;
			
		}
		return null;
	}
}
