package com.somnus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "databind")
public class RequestHeaderBindController {

	@RequestMapping(value="requestheader", method = {RequestMethod.GET})
    public String requestHeaderBind(Model model, 
    		@RequestHeader(value="User-Agent", defaultValue="") String userAgent){
		//获得浏览器类型
		model.addAttribute("userAgent", userAgent);
        return "databind";
    }
	
}