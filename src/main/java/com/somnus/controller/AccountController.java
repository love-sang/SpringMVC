package com.somnus.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.somnus.domain.Account;
import com.somnus.util.WebUtils;
/**
 * @class:AccountController
 * @descript:SpringMVC返回json数据的方式 
 * @date:2016年10月24日 上午11:44:11
 * @author san
 * @version:V1.0
 */
@Controller
@RequestMapping(value = "account")
public class AccountController {
    
    @RequestMapping(value="json", method = {RequestMethod.GET})
    public void json(HttpServletResponse response, PrintWriter out){
    	/*response.setContentType("application/json;charset=UTF-8");*/
    	/*response.setContentType("application/xml;charset=UTF-8");*/
    	response.setContentType("text/html;charset=utf-8");
    	response.setHeader("pragma","no-cache");
    	response.setHeader("cache-control","no-cache");
    	out.write("{\"success\":"+true+",\"tip\":\"用户名已存在\"}");
    }
    
    /**
     * @descript:返回数据格式：.json结尾返回json；.xml结尾返回xml
     * url访问路径：http://localhost:8095/SpringMVC/account/viewResolver.json?username=somnus&password=123456
     * 或者：http://localhost:8095/SpringMVC/account/viewResolver.xml?username=somnus&password=123456
     * 解析器做数据返回格式查看spring-servlet.xml文件配置的视图解析器，返回的3种数据格式
     * @return
     */
    @RequestMapping(value="viewResolver", method = {RequestMethod.GET})
    public ModelAndView viewResolver(){
    	ModelAndView mv = new ModelAndView();
	    Account account = new Account();
	    account.setUsername(WebUtils.getRequest().getParameter("username"));
	    account.setPassword(WebUtils.getRequest().getParameter("password"));
	    mv.addObject(account);
        return mv;
    }
    
    /**
     * @descript:返回数据格式：.json结尾返回json；.xml结尾返回xml
     * url访问路径：http://localhost:8095/SpringMVC/account/map.json?username=1&password=123456
     * @return
     */
    @RequestMapping(value="map", method = {RequestMethod.GET})
    public ModelAndView map(){
    	ModelAndView mv = new ModelAndView();
    	Map<String,String> map = WebUtils.getParamMap();
	    mv.addAllObjects(map);
        return mv;
    }
}
