package com.syrine.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.syrine.demo.entities.Image;

public interface ImageService {
	 Image uplaodImage(MultipartFile file) throws IOException;
	 Image getImageDetails(Long id) throws IOException;
	 ResponseEntity<byte[]> getImage(Long id) throws IOException;
	 void deleteImage(Long id) ;
	 
	 Image uplaodImageInstr(MultipartFile file,Long idInstr) throws IOException;
	 List<Image> getImagesParInstr(Long instrId);
	}
