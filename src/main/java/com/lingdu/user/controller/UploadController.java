package com.lingdu.user.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	/**
	 * 跳转到上传的页面
	 * @return
	 */
	@RequestMapping("/upload")
	public String upload(){
		return "upload";
	}
	
	@RequestMapping("/doUpload")
	public String doUpload(MultipartFile file){
		//获取源文件名
		String orgName = file.getOriginalFilename();
		System.out.println("原文件名：" + orgName);
		String saveName = UUID.randomUUID() + orgName.substring(orgName.lastIndexOf("."));
		try {
			file.transferTo(new File("f://image/" + saveName));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		return "redirect:http://localhost:8080/image/" + saveName;
	}
}
