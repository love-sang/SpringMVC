package com.somnus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.somnus.domain.Account;
/**
 * @class:ModelAttributeController
 * @descript:用于比如某个操作 一个界面完成不了 需要填两个界面
 * @date:2016年10月24日 下午2:14:11
 * @author san
 * @version:V1.0
 */
@Controller
@RequestMapping(value = "ma")
@SessionAttributes(value = "account")
public class ModelAttributeController {
	
	@RequestMapping(value="modelAttribute1", method = {RequestMethod.GET})
	public String modelAttribute(){
		//返回jsp页面，则方法的返回类型为String类型
		return "modelAttribute1";
	}
	
	@RequestMapping(value="modelAttribute2username", method = {RequestMethod.POST})
	public String modelAttribute2username(Account account){
		System.out.println("modelAttribute2username->" + account);
		return "redirect:modelAttribute2";
	}
	
	@RequestMapping(value="modelAttribute2password", method = {RequestMethod.POST})
	public String modelAttribute2password(@ModelAttribute("account")Account account, 
	        SessionStatus status){
	    System.out.println("modelAttribute2password->" + account);
		//销毁@SessionAttributes中value指定名称的数据
		status.setComplete();
		//显示绑定结果
		return "modelAttributeresult";
	}
	
}