package vn.java.banhang.util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

public class FileHelper {

	public String saveFile(MultipartFile multipartFile, ServletContext servletContext) throws IllegalStateException, IOException {
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmmss-"));
	    String fileName = date + multipartFile.getOriginalFilename();
//	    File tmp = new File(servletContext.getRealPath("/WEB-INF/jsp/images") + fileName);
//	    System.out.println(servletContext.getRealPath("/WEB-INF/jsp/images") + fileName);
	    multipartFile.transferTo(new File(servletContext.getRealPath("/WEB-INF/jsp/images") + "/" + fileName));
	    
	    return "images/" + fileName;
	}
}
