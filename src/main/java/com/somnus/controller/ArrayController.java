package com.somnus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "array")
public class ArrayController {
	
	@RequestMapping(value="test", method = {RequestMethod.GET})
	@ResponseBody
    public Person test(Person person){
		person.setName("lili");
		String str[]=new String[3];
		str[0]="羽毛球";
		str[1]="篮球";
		person.setHobby(str);
		System.out.println(JSON.toJSON(person));
        return person;
    }
	
	public static class Person {
		private String name;
		private String[] hobby;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String[] getHobby() {
			return hobby;
		}
		public void setHobby(String[] hobby) {
			this.hobby = hobby;
		}
	}
}
