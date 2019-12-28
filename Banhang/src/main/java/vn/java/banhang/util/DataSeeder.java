package vn.java.banhang.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import vn.java.banhang.service.TaiKhoanService;

@Component 
public class DataSeeder {
	
	@Autowired
	private TaiKhoanService taiKhoanService;
	
	@EventListener
	public void seed(ContextRefreshedEvent event) throws Exception {
		
	}
	
	private void seedAdminTable() {
		
	}
}
