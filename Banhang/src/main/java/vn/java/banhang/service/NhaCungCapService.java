package vn.java.banhang.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.java.banhang.model.NhaCungCap;
import vn.java.banhang.model.TaiKhoan;
import vn.java.banhang.repository.NhaCungCapRepository;

@Service
public class NhaCungCapService {
	@Autowired
	private NhaCungCapRepository nhaCungCapRepository;
	
	public List<NhaCungCap> getListNCC() {
		return nhaCungCapRepository.findAll();
	}
	
	public Optional<NhaCungCap> findNCCId(Long id) {
		return nhaCungCapRepository.findNCCById_NCC(id);
	}
	
	public NhaCungCap saveNCC(NhaCungCap request) {
		return nhaCungCapRepository.save(request);
		
	}
	
	public NhaCungCap createNCC(NhaCungCap nCCRequest) {
		NhaCungCap createNCC = saveNCC(nCCRequest);
		return createNCC;
	}
	
	public NhaCungCap save(NhaCungCap nhaCungCap) {
		return nhaCungCapRepository.save(nhaCungCap);
	}
	
	public void deleteNCC(NhaCungCap nhaCungCap) {
		nhaCungCapRepository.delete(nhaCungCap);
	}
	
	public NhaCungCap updateNCC(Long id, NhaCungCap nCCRequest) {
		NhaCungCap nhaCungCap = nhaCungCapRepository.findById(id).orElse(null);
		if (nhaCungCap != null) {
			nhaCungCap.setTenNhaCungCap(nhaCungCap.getTenNhaCungCap());
			nhaCungCap.setDiaChi(nhaCungCap.getDiaChi());
			nhaCungCap.setSoDienThoai(nhaCungCap.getSoDienThoai());
			final NhaCungCap updateNCC = save(nhaCungCap);
			return updateNCC;			
		}
		return null;
	}
}
