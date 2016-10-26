package com.somnus.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
/**
 * @class:DbFormat
 * @descript:springmvc jsr03验证
 * @date:2016年10月21日 下午1:21:47
 * @author san
 * @version:V1.0
 */
public class DbFormat{
	@NumberFormat(style=Style.NUMBER, pattern="#.##")
	private double money;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date date;
	
	public double getMoney(){
		return money;
	}
	public Date getDate(){
		return date;
	}
	
	public void setMoney(double money){
		this.money=money;
	}
	public void setDate(Date date){
		this.date=date;
	}
	
	
}
