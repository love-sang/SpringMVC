package com.somnus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "databind")
public class CookieValueBindController {
	
	@RequestMapping(value="cookie", method = {RequestMethod.GET})
    public String cookieBind(Model model,
    		@CookieValue(value="JSESSIONID", defaultValue="") String jsessionId,@RequestHeader(value="USER-AGENT", defaultValue="") String userAgent){
		model.addAttribute("jsessionId", jsessionId);
		model.addAttribute("userAgent", userAgent);
        return "databind";
    }
}
